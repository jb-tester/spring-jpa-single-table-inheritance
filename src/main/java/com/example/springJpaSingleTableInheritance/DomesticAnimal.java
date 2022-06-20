package com.example.springJpaSingleTableInheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
