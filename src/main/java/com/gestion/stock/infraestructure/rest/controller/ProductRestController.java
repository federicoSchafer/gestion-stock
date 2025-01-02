package com.gestion.stock.infraestructure.rest.controller;

import com.gestion.stock.common.dto.ProductDto;
import com.gestion.stock.infraestructure.rest.mapper.ProductDtoMapper;
import com.gestion.stock.usecase.IProductInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RequestMapping("/hexagonal/products")
@RestController
public class ProductRestController {

    private final IProductInteractor productInteractor;

    @GetMapping("/{originalCode}")
    public ProductDto findProductByOriginalCode(@PathVariable String originalCode) {
        return ProductDtoMapper.fromProductToDto(productInteractor.findProductByOriginalCode(originalCode));
    }
}

