package hr.kingict.akademija.spring_app.service.impl;

import hr.kingict.akademija.spring_app.dto.ManufacturerDto;
import hr.kingict.akademija.spring_app.mapper.ManufacturerManufacturerDtoMapper;
import hr.kingict.akademija.spring_app.model.Manufacturer;
import hr.kingict.akademija.spring_app.repository.ManufacturerRepository;
import hr.kingict.akademija.spring_app.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Autowired
    private ManufacturerManufacturerDtoMapper manufacturerManufacturerDtoMapper;


    @Override
    public List<ManufacturerDto> findAll() {
        return manufacturerRepository
                .findAll()
                .stream()
                .map(m -> manufacturerManufacturerDtoMapper.map(m))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }
}
