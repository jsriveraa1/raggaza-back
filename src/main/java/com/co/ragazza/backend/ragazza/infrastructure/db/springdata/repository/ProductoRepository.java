package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
}
