package com.electricitybillgenerator.ElectricityBillGenerator.dao;

import java.time.Month;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.electricitybillgenerator.ElectricityBillGenerator.entity.CustomerBill;

public interface CustomerBillRepository extends JpaRepository<CustomerBill,Integer>{
	
	//@Query("select b from customer_bill b where b.customer_id = :id")
	public List<CustomerBill> findByCustomerId(@Param("id") Integer id);

	public List<CustomerBill> findByMonth(Month month);

	public List<CustomerBill> findTotalBillOfAllCustomerByMonth(Month month);

	@Query("select b from customer_bill")
	public List<CustomerBill> findCustomerByMonth(Integer id, Month month);
}
