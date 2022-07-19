package hr.kingict.akademija.spring_app.controller;

import hr.kingict.akademija.spring_app.dto.ManufacturerDto;
import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.form.ManufacturerForm;
import hr.kingict.akademija.spring_app.form.VegetableForm;
import hr.kingict.akademija.spring_app.mapper.ManufacturerFormManufacturerMapper;
import hr.kingict.akademija.spring_app.mapper.VegetableFormVegetableMapper;
import hr.kingict.akademija.spring_app.service.ManufacturerService;
import hr.kingict.akademija.spring_app.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private ManufacturerFormManufacturerMapper manufacturerFormManufacturerMapper;

    @GetMapping
    ResponseEntity<List<ManufacturerDto>> findAll() {
        return ResponseEntity
                .ok()
                .body(manufacturerService.findAll());

    }

    @PostMapping
    ResponseEntity<String> create(@Valid @RequestBody ManufacturerForm manufacturerForm) {

        manufacturerService.save(manufacturerFormManufacturerMapper.map(manufacturerForm));

        return ResponseEntity
                .ok()
                .body("ok");

    }

}
