package com.co.ragazza.backend.ragazza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material implements Serializable {

    private Long id;
    private String descripcion;
    private Integer porcentajeGanancia;

}
