package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.mapper;

import com.co.ragazza.backend.ragazza.domain.Accesorio;
import com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo.AccesorioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccesorioMapper {

    List<Accesorio> accesorioEntityToAccesorio(List<AccesorioEntity> accesorio);

    AccesorioEntity accesorioToAccesorioEntity(Accesorio accesorio);

}
