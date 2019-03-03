package com.gaurav;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Country implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }
}
