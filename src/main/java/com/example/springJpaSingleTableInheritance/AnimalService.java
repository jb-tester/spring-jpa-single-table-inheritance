package com.example.springJpaSingleTableInheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void addAnimal() {
        long size = animalRepository.count();
        Animal animal = new DomesticAnimal(size+1,"chinchilla","grey",0,0,"standard",false);
        animalRepository.save(animal);
        System.out.println(animal.getId());
    }
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
        for (DomesticAnimal animal : animalRepository.findByColor("various")) {
            System.out.println(animal);
        }
        System.out.println("=== fairy and wild animals ");
        for (Animal animal : animalRepository.findByTypes()) {
            System.out.println(animal);
        }
        System.out.println("=== fairy and wild animals");
        for (Animal animal : animalRepository.findByTypesChoice()) {
            System.out.println(animal);
        }
        System.out.println("=== domestic animals by breed:");
        for (DomesticAnimal animal : animalRepository.findByBreed("corgi")) {
            System.out.println(animal);
        }
    }

    public void temp() {
        System.out.println("====== type(e) =====");
        animalRepository.getType().forEach(System.out::println);
        System.out.println("===================");
        animalRepository.getType1().forEach(System.out::println);
        System.out.println("===================");
        animalRepository.getType2().forEach(System.out::println);
        System.out.println("===================");
        animalRepository.getType3().forEach(System.out::println);
    }

    ;
}
