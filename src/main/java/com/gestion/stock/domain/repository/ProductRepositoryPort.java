package com.gestion.stock.domain.repository;

import com.gestion.stock.domain.model.Product;

public interface ProductRepositoryPort {
    Product findProductByOriginalCode(String originalCode);
}
