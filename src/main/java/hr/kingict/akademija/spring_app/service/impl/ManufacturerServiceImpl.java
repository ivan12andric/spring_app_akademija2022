package hr.kingict.akademija.spring_app.service.impl;

import hr.kingict.akademija.spring_app.dto.ManufacturerDto;
import hr.kingict.akademija.spring_app.mapper.ManufacturerManufacturerDtoMapper;
import hr.kingict.akademija.spring_app.model.Manufacturer;
import hr.kingict.akademija.spring_app.repository.ManufacturerRepository;
import hr.kingict.akademija.spring_app.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@PreAuthorize("hasRole('ADMIN')") // - radi za sve metode u servisu
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
    //@Secured("ADMIN") // ne radi - eventualno istražiti
    //@PreAuthorize("hasRole('ADMIN')") // radi
    public void save(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }
}
