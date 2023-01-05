package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.resources;

import com.co.ragazza.backend.ragazza.application.service.MaterialLogic;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.MaterialDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper.MaterialRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("material")
public class MaterialController {

    private final MaterialLogic materialLogic;
    private final MaterialRestMapper materialRestMapper;

    public MaterialController(MaterialLogic materialLogic, MaterialRestMapper materialRestMapper) {
        this.materialLogic = materialLogic;
        this.materialRestMapper = materialRestMapper;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<MaterialDto>> listar() {
        return new ResponseEntity<>(
                materialRestMapper.toMaterialDto(materialLogic.listar()),
                HttpStatus.CREATED);

    }
}
