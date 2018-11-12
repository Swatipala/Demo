package com.stationery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stationery.entity.Stationery;
import com.stationery.services.IStationeryService;

@Controller
@RequestMapping("warehouse")
public class StationeryWarehouseConrtoller {
	
	@Autowired
	private IStationeryService stationeryService;
	
	@GetMapping("stationeries")
	public  ResponseEntity<List<Stationery>> getAllAvailableStationeries(){
		List<Stationery> list = stationeryService.getAllStationery();
		return new ResponseEntity<List<Stationery>>(list, HttpStatus.OK);
	}
	@PostMapping("addstationery")
	public  ResponseEntity<List<Stationery>> addNewStationery(@RequestBody Stationery str){
		stationeryService.addStationery(str);
		return new ResponseEntity<List<Stationery>>( HttpStatus.CREATED);
	}
}
