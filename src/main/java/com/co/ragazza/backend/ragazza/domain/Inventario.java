package com.co.ragazza.backend.ragazza.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inventario implements Serializable {

    private Long id;
    private Proveedor proveedor;

    @JsonIgnore
    private Producto producto;
    private Integer stock;

}
