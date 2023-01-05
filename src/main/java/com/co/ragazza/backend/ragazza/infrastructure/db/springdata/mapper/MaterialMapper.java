package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper;

import com.co.ragazza.backend.ragazza.domain.Material;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.MaterialEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialMapper {

    List<Material> toMaterial(List<MaterialEntity> materialEntity);

    MaterialEntity toMaterialEntity(Material material);

}
