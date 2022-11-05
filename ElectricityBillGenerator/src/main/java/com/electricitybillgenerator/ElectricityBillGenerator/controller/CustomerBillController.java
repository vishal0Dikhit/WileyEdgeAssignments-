package com.electricitybillgenerator.ElectricityBillGenerator.controller;

import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electricitybillgenerator.ElectricityBillGenerator.entity.CustomerBill;
import com.electricitybillgenerator.ElectricityBillGenerator.service.CustomerBillService;

@RestController
@RequestMapping("/bill")
public class CustomerBillController {
	
	@Autowired
	CustomerBillService service;
	
	@GetMapping("/getBill/{customerId}")
	public ResponseEntity<List<CustomerBill>> getBillByCustomerId(@PathVariable("customerId") Integer id){
		return service.getBillByCustomerId(id);
	}
	
	@GetMapping("/getCustomerBillByMonth/{id}/{month}")
	public ResponseEntity<List<CustomerBill>> getBillByMonth(@PathVariable("id") Integer id, @PathVariable("month") Month month)
	{
		return service.getCustomerBillByMonth(id,month);
	}
	
	@GetMapping("/getBillByMonth/{month}")
	public ResponseEntity<List<CustomerBill>> getBillByMonth(@PathVariable("month") Month month)
	{
		return service.getBillByMonth(month);
	}
	
	@GetMapping("/getTotalBillOfAllCustomerByMonth/{month}")
	public ResponseEntity<List<CustomerBill>> getTotalBillOfAllCustomerByMonth(@PathVariable("month") Month month)
	{
		return service.getTotalBillOfAllCustomerByMonth(month);
	}
}
