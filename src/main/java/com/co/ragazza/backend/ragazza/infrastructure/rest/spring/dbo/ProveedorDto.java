package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProveedorDto implements Serializable {

    private Long id;
    private String descripcion;

}
