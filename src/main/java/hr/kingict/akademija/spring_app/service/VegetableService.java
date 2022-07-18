package hr.kingict.akademija.spring_app.service;

import hr.kingict.akademija.spring_app.dto.VegetableDto;

import java.util.List;

public interface VegetableService {

    List<VegetableDto> findAll();
}
