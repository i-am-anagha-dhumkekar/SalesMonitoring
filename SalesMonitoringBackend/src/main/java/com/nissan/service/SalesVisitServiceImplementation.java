package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDao;
import com.nissan.dao.ISalesVisitDao;
import com.nissan.model.Employee;
import com.nissan.model.SalesVisit;
@Service
public class SalesVisitServiceImplementation implements ISalesVisitService{
	@Autowired
	ISalesVisitDao salesDao;
	@Autowired
	IEmployeeDao employeeDao;
	@Override
	public List<SalesVisit> getAllSales() {
		// TODO Auto-generated method stub
		return salesDao.findAll();
	}

	@Override
	public SalesVisit addSale(SalesVisit sale) {
		// TODO Auto-generated method stub
		return salesDao.save(sale);
	}

	@Override
	public SalesVisit getSaleById(Integer id) {
		// TODO Auto-generated method stub
		return salesDao.findById(id).get();
	}

	@Override
	public SalesVisit updateSale(SalesVisit sale) {
		// TODO Auto-generated method stub
		return salesDao.save(sale);
	}

	@Override
	public void deleteSale(Integer id) {
		salesDao.deleteById(id);
		
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.findAll();
	}

}
