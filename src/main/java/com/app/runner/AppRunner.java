package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.app.repository.ProductRepository;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.findAll(
				Sort.by("prodCost")
				).forEach(System.out::println);
		

	}

}
