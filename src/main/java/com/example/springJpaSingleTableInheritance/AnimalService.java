package com.example.springJpaSingleTableInheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 6/20/2022.</p>
 * <p>Project: spring-jpa-single-table-inheritance</p>
 * *
 */
@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public void display(){
        System.out.println("== all animals:");
        for (Animal animal : animalRepository.findAll()) {
            System.out.println(animal);
        }
        System.out.println("=== all wild animals:");
        for (Animal animal : animalRepository.allWildAnimals()) {
            System.out.println(animal);
        }
        System.out.println("=== domestic animals by color");
        for (DomesticAnimal animal : animalRepository.findByColor("various", 1)) {
            System.out.println(animal);
        }
        System.out.println("=== fairy and wild animals ");
        for (Animal animal : animalRepository.findByTypes()) {
            System.out.println(animal);
        }
        System.out.println("domestic animals by breed:");
        for (DomesticAnimal animal : animalRepository.findByBreed("corgi")) {
            System.out.println(animal);
        }
    }
}
