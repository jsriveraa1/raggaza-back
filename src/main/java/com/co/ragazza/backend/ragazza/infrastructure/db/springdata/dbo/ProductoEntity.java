package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Producto")
public class ProductoEntity implements Serializable {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id", nullable = false)
    private MaterialEntity material;

    private String imagen;
    private BigDecimal costoProducto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accesorio_id", nullable = false)
    private AccesorioEntity accesorio;

    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            targetEntity = InventarioEntity.class,
            mappedBy = "producto"
    )
    private InventarioEntity inventario;
}
