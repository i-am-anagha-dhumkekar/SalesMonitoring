package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;
import com.nissan.model.SalesVisit;

public interface ISalesVisitService {
	//get all sales
	List<SalesVisit> getAllSales();
	//add sales
	SalesVisit addSale(SalesVisit sale);
	//get sale by id
	SalesVisit getSaleById(Integer id);
	//update sale
	SalesVisit updateSale(SalesVisit sale);
	//delete sale
	void deleteSale(Integer id);
	//get all employees
	
	List<Employee> getAllEmployees();
}
