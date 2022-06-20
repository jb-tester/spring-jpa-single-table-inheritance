package com.example.springJpaSingleTableInheritance;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 6/20/2022.</p>
 * <p>Project: spring-jpa-single-table-inheritance</p>
 * <p> 'class' property is not resolved: </p>
 * <p><a href="https://youtrack.jetbrains.com/issue/IDEA-296168">https://youtrack.jetbrains.com/issue/IDEA-296168</a></p>
 */
public interface AnimalRepository extends CrudRepository<Animal,Long> {
    @Query("select a from Animal a where a.class = WildAnimal")
    List<Animal> allWildAnimals();

    @Query("select a from Animal a where a.class = DomesticAnimal and a.colour = :color")
    List<DomesticAnimal> findByColor(@Param("color") String color);

    List<DomesticAnimal> findByBreed(String breed); // errors are reported
}
