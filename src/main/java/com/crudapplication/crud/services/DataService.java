package com.crudapplication.crud.services;

import java.util.List;

import com.crudapplication.crud.model.Data;

public interface DataService {

	public Data addData(Data data);
	
	public List<Data> getDatas();
//	
	public Data getData(long dataId);
	
	public Data UpdataData(Data data);
	
	public Data deleteData(long dataId);
}
