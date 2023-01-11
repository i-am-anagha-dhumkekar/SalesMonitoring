package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.model.SalesVisit;
import com.nissan.service.ISalesVisitService;

@CrossOrigin
@RestController
@RequestMapping({"api/"})
public class SalesVisitController {
	@Autowired
	ISalesVisitService salesService;
	@GetMapping("sales")
	public List<SalesVisit> getAllSales()
	{
		return salesService.getAllSales();
	}
	@GetMapping("sales/{id}")
	public SalesVisit getSaleById(@PathVariable Integer id)
	{
		return salesService.getSaleById(id);
		
	}
	@PostMapping("sales")
	public SalesVisit addSales(@RequestBody SalesVisit sale)
	{
		return salesService.addSale(sale);
		
	}
	@PutMapping("sales")
	public SalesVisit updateSales(@RequestBody SalesVisit sale)
	{
		return salesService.updateSale(sale);
		
	}
	@DeleteMapping("sales/{id}")
	public void deleteSale(@PathVariable Integer id)
	{
		salesService.deleteSale(id);
	}
	@GetMapping("employees")
	public List<Employee> getAllEmployee()
	{
		return salesService.getAllEmployees();
	}
}
