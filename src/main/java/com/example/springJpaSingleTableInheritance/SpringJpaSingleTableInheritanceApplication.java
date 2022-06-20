package com.example.springJpaSingleTableInheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
public class SpringJpaSingleTableInheritanceApplication implements CommandLineRunner {

    @Autowired
    private AnimalService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaSingleTableInheritanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.display();
    }
}
