package hr.kingict.akademija.spring_app.controller;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.form.VegetableForm;
import hr.kingict.akademija.spring_app.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/vegetables")
public class VegetableController {

    @Autowired
    private VegetableService vegetableService;

    /*@GetMapping
    List<VegetableDto> findAll() {
      return Arrays
                .asList(new VegetableDto(1, "Brokula", "zelena", null),
                        new VegetableDto(2, "Mrkva", "narančasta", null));
    }*/

   /* @GetMapping
    ResponseEntity<List<VegetableDto>> findAll() {

        return new ResponseEntity<List<VegetableDto>>(
                Arrays
                        .asList(new VegetableDto(1, "Brokula", "zelena", null),
                                new VegetableDto(2, "Mrkva", "narančasta", null)),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }*/

   /* @GetMapping
    ResponseEntity<List<VegetableDto>> findAll() {

        return ResponseEntity
                .ok()
                .body(Arrays
                        .asList(VegetableDto.builder().id(1).name("Brokula").color("zelena").build(),
                                VegetableDto.builder().id(2).name("Mrkva").color("narančasta").build()));

    }*/


    @GetMapping
    ResponseEntity<List<VegetableDto>> findAll() {
        return ResponseEntity
                .ok()
                .body(vegetableService.findAll());

    }

    @GetMapping(value = "/{id}")
    ResponseEntity<VegetableDto> findById(@PathVariable Integer id) {

        return ResponseEntity
                .ok()
                .body(vegetableService.findById(id));

    }

    @GetMapping(value = "/{name}/{color}")
    ResponseEntity<List<VegetableDto>> findByNameAndColour(@PathVariable String name, @PathVariable String color) {

        return ResponseEntity
                .ok()
                .body(vegetableService.findAllByNameAndColourOrderByNameDesc(name, color));

    }

  /*  @PostMapping
    ResponseEntity<String> create(@Valid @RequestBody VegetableForm vegetableForm, Errors errors) {

        if(errors.hasErrors()){

           return ResponseEntity.internalServerError().body(errors.getFieldError().toString());
        }

        return ResponseEntity
                .ok()
                .body("ok");

    }*/

    @PostMapping
    ResponseEntity<String> create(@Valid @RequestBody VegetableForm vegetableForm) {

        return ResponseEntity
                .ok()
                .body("ok");

    }

    @ExceptionHandler
    ResponseEntity<String> handleException(Exception exception) {

        return ResponseEntity
                .internalServerError()
                .body(exception.getMessage());

    }




}
