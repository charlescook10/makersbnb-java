package com.makers.makersbnb.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity // instances of this class map to database records
@Getter
@Setter @NoArgsConstructor @Table(name = "SPACES") // those records can be found in the spaces table
public class Space {
    // the following field (id) is the primary key for this Entity
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    // Constructor
    public Space(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
