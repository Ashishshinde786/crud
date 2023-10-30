package com.crudapplication.crud.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.DataDao;
import com.crudapplication.crud.model.Data;

@Service 
public class DataServiceImpl implements DataService {

	@Autowired
	private DataDao dataDao;
	
	@Override
	public Data addData(Data data) {
		dataDao.save(data);
		return data;
	}

	@Override
	public List<Data> getDatas() {
		return dataDao.findAll();
	}

	@Override
	public Data getData(long dataId) {
		return dataDao.findById(dataId).get();
	}

	@Override
	public Data UpdataData(Data data) {
       dataDao.save(data);
       return data;
	}

	@Override
	public Data deleteData(long dataId) {
		Data data = dataDao.findById(dataId).get();
		dataDao.delete(data);
		return data;
	}

	
	

}
