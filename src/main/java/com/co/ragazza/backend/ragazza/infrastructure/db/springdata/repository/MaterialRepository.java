package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.repository;

import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.MaterialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<MaterialEntity, Long> {
}
