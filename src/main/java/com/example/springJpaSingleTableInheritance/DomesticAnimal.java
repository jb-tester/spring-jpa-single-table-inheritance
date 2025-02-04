package com.example.springJpaSingleTableInheritance;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * *
 * <p>Created by irina on 6/20/2022.</p>
 * <p>Project: spring-jpa-single-table-inheritance</p>
 * *
 */
@Entity
@DiscriminatorValue("1")
public class DomesticAnimal extends Animal {

    private String breed;

    @Column(name = "prod")
    private boolean productive;

    public DomesticAnimal(Long id, String species, String colour, int average_size, int average_weight, String breed, boolean productive) {
        super(id, species, colour, average_size, average_weight);
        this.breed = breed;
        this.productive = productive;
    }

    public DomesticAnimal() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isProductive() {
        return productive;
    }

    public void setProductive(boolean productive) {
        this.productive = productive;
    }
}
