package com.gestion.stock.infraestructure.database.mysql.adapter;

import com.gestion.stock.domain.model.Product;
import com.gestion.stock.domain.repository.ProductRepositoryPort;
import com.gestion.stock.infraestructure.database.mysql.mapper.ProductEntityMapper;
import com.gestion.stock.infraestructure.database.mysql.repository.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Product findProductByOriginalCode(String originalCode) {
        return productJpaRepository.findByOriginalCode(originalCode)
                .map(ProductEntityMapper::fromEntityToProduct)  // usamos el map de optional para convertir nuestro ProductEntity a nuestro Product (modelo)
                .orElseThrow(() -> new NoSuchElementException("Product not found")); // si no hay elemento presente (dentro del optional), devolvemos una excepción
    }

}
