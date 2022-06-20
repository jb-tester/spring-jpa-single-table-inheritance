package com.example.springJpaSingleTableInheritance;

import org.hibernate.annotations.DiscriminatorFormula;

import javax.persistence.*;

/**
 * *
 * <p>Created by irina on 6/20/2022.</p>
 * <p>Project: spring-jpa-single-table-inheritance</p>
 * *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("null")
@DiscriminatorColumn(name="animal_type",
        discriminatorType = DiscriminatorType.INTEGER)
//@DiscriminatorFormula("case when breed is not null and prod is not null then 1 else 2 end")
public class Animal {
    @Id
    private Long id;

    private String species;
    private String colour;
    @Column(name = "size")
    private int average_size;
    @Column(name = "weight")
    private int average_weight;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAverage_size() {
        return average_size;
    }

    public void setAverage_size(int average_size) {
        this.average_size = average_size;
    }

    public int getAverage_weight() {
        return average_weight;
    }

    public void setAverage_weight(int average_weight) {
        this.average_weight = average_weight;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
