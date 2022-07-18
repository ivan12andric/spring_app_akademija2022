package hr.kingict.akademija.spring_app.service.impl;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.repository.VegetableRepository;
import hr.kingict.akademija.spring_app.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VegetableServiceImpl implements VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Override
    public List<VegetableDto> findAll() {

        return vegetableRepository
                .findAll()
                .stream()
                .map(v -> VegetableDto.builder().id(v.getId()).name(v.getName()).color(v.getColor()).build())
                .collect(Collectors.toList()) ;
    }
}
