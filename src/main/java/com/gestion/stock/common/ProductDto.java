package com.gestion.stock.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class ProductDto {
    private String name;
    private String originalCode;

    public ProductDto(String name, String originalCode) {
        this.name = name;
        this.originalCode = originalCode;
    }

}
