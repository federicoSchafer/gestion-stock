package com.gestion.stock.infraestructure.database.mysql.mapper;

import com.gestion.stock.domain.model.Product;
import com.gestion.stock.infraestructure.database.mysql.entity.ProductEntity;

public class ProductEntityMapper {

    public static Product fromEntityToProduct(ProductEntity productEntity) {
        return new Product(productEntity.getOriginalCode(),
                            productEntity.getName()
        );
    }
}
