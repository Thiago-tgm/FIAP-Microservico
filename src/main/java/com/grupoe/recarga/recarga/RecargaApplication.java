package com.grupoe.recarga.recarga;

import com.grupoe.recarga.recarga.domain.Recharge;
import com.grupoe.recarga.recarga.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RecargaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecargaApplication.class, args);
	}

}
