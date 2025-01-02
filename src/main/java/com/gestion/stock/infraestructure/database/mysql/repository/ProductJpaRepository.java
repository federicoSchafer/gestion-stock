package com.gestion.stock.infraestructure.database.mysql.repository;

import com.gestion.stock.infraestructure.database.mysql.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long>{
    Optional<ProductEntity> findByOriginalCode(String originalCode);
}
