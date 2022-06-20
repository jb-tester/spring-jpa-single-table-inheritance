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
@DiscriminatorValue("2")
public class WildAnimal extends Animal {
    private String areal;
    @Column(name="rare")
    private boolean _protected;

    public String getAreal() {
        return areal;
    }

    public void setAreal(String areal) {
        this.areal = areal;
    }

    public boolean is_protected() {
        return _protected;
    }

    public void set_protected(boolean _protected) {
        this._protected = _protected;
    }
}
