package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Accesorio")
public class AccesorioEntity implements Serializable {

    @Id
    private Long id;
    private String descripcion;

}
