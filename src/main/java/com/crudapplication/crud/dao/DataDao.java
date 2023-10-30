package com.crudapplication.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.crud.model.Data;

public interface DataDao extends JpaRepository<Data, Long> {

}
