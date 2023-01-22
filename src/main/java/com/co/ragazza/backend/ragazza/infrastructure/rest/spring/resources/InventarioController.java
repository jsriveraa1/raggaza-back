package com.co.ragazza.backend.ragazza.infrastructure.rest.spring.resources;

import com.co.ragazza.backend.ragazza.application.service.InventarioLogic;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.InventarioDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.dbo.ProductoDto;
import com.co.ragazza.backend.ragazza.infrastructure.rest.spring.mapper.InventarioRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inventario")
@CrossOrigin(value = "*", origins = "*")
public class InventarioController {

    private final InventarioLogic inventarioLogic;
    private final InventarioRestMapper inventarioRestMapper;

    public InventarioController(InventarioLogic inventarioLogic, InventarioRestMapper inventarioRestMapper) {
        this.inventarioLogic = inventarioLogic;
        this.inventarioRestMapper = inventarioRestMapper;
    }

    @PostMapping(value = "crear", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<InventarioDto> crearInventario(@RequestBody InventarioDto inventarioDto) {
        return null;
//        new ResponseEntity<>(
//                inventarioRestMapper.toInventarioDto(
//                        inventarioLogic.crear(inventarioRestMapper.toInventario(inventarioDto))),
//                HttpStatus.CREATED);
    }


}
