package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccesorioDto implements Serializable {

    private Long id;
    private String descripcion;

}
