package com.gestion.stock.infraestructure.database.mysql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "products")
@NoArgsConstructor
public class ProductEntity {
    @Id
    private String originalCode;
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private UUID id;
    private String name;
//    private String supplierCode;
//    private String description;
//    private String carBrand;
//    private String carModel;
//    private String category;
//    private Integer stock;
//    private String origin;
//    private Year carYear;
//    private String brand;

    public ProductEntity(String originalCode, String name) {
        this.originalCode = originalCode;
        this.name = name;
    }

}
