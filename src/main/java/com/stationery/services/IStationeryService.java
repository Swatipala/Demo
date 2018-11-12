package com.stationery.services;

import java.util.List;

import com.stationery.entity.Stationery;

public interface IStationeryService {

	List<Stationery> getAllStationery();
	void addStationery(Stationery str);
}
