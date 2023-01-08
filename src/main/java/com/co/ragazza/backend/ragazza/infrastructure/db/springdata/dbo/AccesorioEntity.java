package com.co.ragazza.backend.ragazza.infrastructure.db.springdata.dbo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
