package hr.kingict.akademija.spring_app.service;

import hr.kingict.akademija.spring_app.dto.ManufacturerDto;
import hr.kingict.akademija.spring_app.model.Manufacturer;

import java.util.List;

public interface ManufacturerService {

    List<ManufacturerDto> findAll();

    void save(Manufacturer vegetable) ;
}
