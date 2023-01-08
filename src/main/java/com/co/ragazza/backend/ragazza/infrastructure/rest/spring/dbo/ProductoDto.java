package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDto implements Serializable {

    private Long id;

    private MaterialDto material;

    private String imagen;
    private BigDecimal costoProducto;

    private AccesorioDto accesorio;
    private InventarioDto inventario;

    public ProductoDto(Long id) {
        this.id = id;
    }
}
