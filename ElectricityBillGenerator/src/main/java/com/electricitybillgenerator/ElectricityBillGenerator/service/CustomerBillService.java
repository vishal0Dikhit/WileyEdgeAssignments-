package com.electricitybillgenerator.ElectricityBillGenerator.service;

import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.electricitybillgenerator.ElectricityBillGenerator.dao.CustomerBillRepository;
import com.electricitybillgenerator.ElectricityBillGenerator.entity.CustomerBill;
@Service
public class CustomerBillService {
	
	@Autowired
	CustomerBillRepository billRepository;
	
	//Get bill of a customer by id
	public ResponseEntity<List<CustomerBill>> getBillByCustomerId(Integer id){
		try {
			List<CustomerBill> customerBills = billRepository.findByCustomerId(id);
			
			if (customerBills.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(customerBills, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	//Get bill of a particular customer by month  
	public ResponseEntity<List<CustomerBill>> getCustomerBillByMonth(Integer id, Month month){
		try {

			List<CustomerBill> customerBills = billRepository.findCustomerByMonth(id,month);
			
			if (customerBills.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(customerBills, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Get bill of all customer by month 
	public ResponseEntity<List<CustomerBill>> getBillByMonth(Month month){
		try {

			List<CustomerBill> customerBills = billRepository.findByMonth(month);
			
			if (customerBills.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(customerBills, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//Get total bill of all customers
	public ResponseEntity<List<CustomerBill>> getTotalBillOfAllCustomerByMonth(Month month){
		try {

			List<CustomerBill> customerBills = billRepository.findTotalBillOfAllCustomerByMonth(month);
			
			if (customerBills.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(customerBills, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
