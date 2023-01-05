package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper;

import com.co.ragazza.backend.ragazza.domain.Material;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.MaterialDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialRestMapper {

//    Material toMaterial();

    List<MaterialDto> toMaterialDto(List<Material> material);

}
