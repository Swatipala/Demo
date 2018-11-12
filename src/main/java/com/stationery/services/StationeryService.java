package com.stationery.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stationery.entity.Stationery;
import com.stationery.repositories.IStationeryRepository;

@Service
public class StationeryService implements IStationeryService {

	@Autowired
	private IStationeryRepository stationeryRepository;
	@Override
	public List<Stationery> getAllStationery() {
		List<Stationery> list = new ArrayList<>();
		stationeryRepository.findAll().forEach(e ->list.add(e));
		return list;
	}
	@Override
	public void addStationery(Stationery str) {
		stationeryRepository.save(str);
		
	}

}
