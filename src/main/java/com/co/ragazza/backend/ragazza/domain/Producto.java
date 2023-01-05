package com.co.ragazza.backend.ragazza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {

    private Long id;
    private Material material;
    private String imagen;
    private BigDecimal costoProducto;
    private Accesorio accesorio;
    private Inventario inventario;

    public Producto(Long id) {
        this.id = id;
    }
}
