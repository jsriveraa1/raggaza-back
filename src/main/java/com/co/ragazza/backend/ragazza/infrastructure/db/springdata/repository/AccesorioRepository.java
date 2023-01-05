package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.AccesorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccesorioRepository extends JpaRepository<AccesorioEntity, Long> {
}
