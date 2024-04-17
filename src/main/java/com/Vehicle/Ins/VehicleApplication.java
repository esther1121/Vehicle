package com.Vehicle.Ins;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Vehicle.entity")
public class VehicleApplication {
	public static void main(String[] args) {
		SpringApplication.run(VehicleApplication.class, args);
	}

}
