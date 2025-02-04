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
 * Upd: fixed
 */
public interface AnimalRepository extends CrudRepository<Animal, Long> {
    @Query("select a from Animal a where a.class = WildAnimal")
    List<Animal> allWildAnimals();

    // hibernate fails to convert integers to classes in runtime for some reason
    @Query("select a from Animal a where type(a) = :type and a.colour = :color")
    List<DomesticAnimal> findByColorWithTypeAsParam(@Param("color") String color, @Param("type") Integer type);

    // but this works, though we report this query as error:
    @Query("select a from Animal a where type(a) = 1 and a.colour = :color")
    List<DomesticAnimal> findByColor(@Param("color") String color);

    @Query("select a from Animal a where a.class in (FairyAnimal, WildAnimal)")
    List<Animal> findByTypes();

    // hibernate fails to convert integers to classes in runtime for some reason
    @Query("select a from Animal a where a.class in (:t1, :t2)")
    List<Animal> findByTypesAsParams(@Param("t1") Integer t1, @Param("t2") Integer t2);

    @Query("select a from Animal a where a.class in (2, 3)")
    List<Animal> findByTypesChoice();

    @Query("select type(e) from Animal e")
    List getType();

    @Query("select e.class from Animal e")
    List getType1();

    @Query("select e from Animal e where e.class = 1")
    List getType2();

    @Query("select e from Animal e where type(e) = 2")
    List getType3();

    List<DomesticAnimal> findByBreed(String breed); // errors are reported
}
