package com.crudapplication.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.crud.model.Data;
import com.crudapplication.crud.services.DataService;


@RestController
@CrossOrigin
public class DataController {
	
	
	@Autowired
	private DataService dataService;
    
	@PostMapping("/data")
	public Data addData(@RequestBody Data data) {
		return  this.dataService.addData(data);
	}
	
	@GetMapping("/datas")
	public List<Data> getDatas(){
		return this.dataService.getDatas();
	}
	
	@GetMapping("/datas/{dataId}")
	public Data getData(@PathVariable String dataId) {
		return this.dataService.getData(Long.parseLong(dataId));
	}
	
	@PutMapping("/data")
	public Data UpdataData(@RequestBody Data data) {
		return this.dataService.UpdataData(data);
	}
	
	@DeleteMapping("/data/{dataId}")
	public Data deleteData(@PathVariable String dataId) {
		return this.dataService.deleteData(Long.parseLong(dataId));
	}
	
}
