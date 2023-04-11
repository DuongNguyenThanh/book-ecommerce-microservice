package com.example.userservice;

import com.example.userdatamodel.config.EnableUserDataModel;
import com.example.userdatamodel.config.liquibase.EnableUserLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableUserDataModel
@EnableUserLiquibase
@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
