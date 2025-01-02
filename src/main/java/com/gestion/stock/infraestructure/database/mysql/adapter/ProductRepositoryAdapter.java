package com.gestion.stock.infraestructure.database.mysql.adapter;

import com.gestion.stock.common.exception.BusinessException;
import com.gestion.stock.domain.model.Product;
import com.gestion.stock.domain.repository.ProductRepositoryPort;
import com.gestion.stock.infraestructure.database.mysql.mapper.ProductEntityMapper;
import com.gestion.stock.infraestructure.database.mysql.repository.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Product findProductByOriginalCode(String originalCode) {
        return productJpaRepository.findByOriginalCode(originalCode)
                .map(ProductEntityMapper::fromEntityToProduct)
                .orElseThrow(() -> new BusinessException("PRODUCT_NOT_FOUND", "Product with ID " + originalCode + " not found"));
    }

}
