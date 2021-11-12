package com.cursoapidev;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cursoapidev.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses = HomeController.class )
public class Ejercicio10Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio10Application.class, args);
	}

}
