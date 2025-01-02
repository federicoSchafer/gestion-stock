package com.gestion.stock.usecase;

import com.gestion.stock.domain.model.Product;
import com.gestion.stock.domain.repository.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductInteractorImpl implements IProductInteractor {

    private final ProductRepositoryPort productRepository;

    @Override
    public Product findProductByOriginalCode(String originalCode) {
        return productRepository.findProductByOriginalCode(originalCode);
    }

}
