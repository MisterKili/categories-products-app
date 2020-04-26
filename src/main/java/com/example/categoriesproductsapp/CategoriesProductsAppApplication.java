package com.example.categoriesproductsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Validator;

@SpringBootApplication
public class CategoriesProductsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoriesProductsAppApplication.class, args);

	}

	@Bean
	Validator validator(){
		return new LocalValidatorFactoryBean();
	}
}
