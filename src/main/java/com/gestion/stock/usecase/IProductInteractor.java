package com.gestion.stock.usecase;

import com.gestion.stock.domain.model.Product;

public interface IProductInteractor {
    Product findProductByOriginalCode(String originalCode);
}
