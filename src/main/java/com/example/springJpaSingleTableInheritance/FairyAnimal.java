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
@DiscriminatorValue("3")
public class FairyAnimal extends Animal {

}
