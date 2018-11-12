package com.stationery.repositories;

import org.springframework.data.repository.CrudRepository;

import com.stationery.entity.Stationery;

public interface IStationeryRepository extends CrudRepository<Stationery, Integer>{

}
