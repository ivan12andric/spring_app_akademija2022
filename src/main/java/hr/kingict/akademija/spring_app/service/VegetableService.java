package hr.kingict.akademija.spring_app.service;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.model.Vegetable;

import java.util.List;
import java.util.Optional;

public interface VegetableService {

    VegetableDto findById(Integer id);

    List<VegetableDto> findAll();

    List<VegetableDto> findAllByNameAndColourOrderByNameDesc(String name, String color);
}
