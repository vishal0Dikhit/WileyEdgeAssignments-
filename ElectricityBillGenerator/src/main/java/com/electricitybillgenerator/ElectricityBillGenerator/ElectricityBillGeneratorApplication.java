package com.electricitybillgenerator.ElectricityBillGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ElectricityBillGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricityBillGeneratorApplication.class, args);
	}
	
}
