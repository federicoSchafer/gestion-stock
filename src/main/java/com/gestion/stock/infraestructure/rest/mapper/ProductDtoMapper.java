package com.gestion.stock.infraestructure.rest.mapper;

import com.gestion.stock.common.dto.ProductDto;
import com.gestion.stock.domain.model.Product;

public class ProductDtoMapper {
    public static ProductDto fromProductToDto(Product product) {
        return new ProductDto(product.getOriginalCode(),
                product.getName()
        );
    }

}
