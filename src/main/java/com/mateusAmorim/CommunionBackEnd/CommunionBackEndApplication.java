package com.mateusAmorim.CommunionBackEnd;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class CommunionBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunionBackEndApplication.class, args);
	}



}
