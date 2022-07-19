package hr.kingict.akademija.spring_app.service.impl;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.mapper.VegetableVegetableDtoMapper;
import hr.kingict.akademija.spring_app.model.Vegetable;
import hr.kingict.akademija.spring_app.repository.VegetableRepository;
import hr.kingict.akademija.spring_app.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VegetableServiceImpl implements VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Autowired
    private VegetableVegetableDtoMapper vegetableVegetableDtoMapper;

    @Override
    public VegetableDto findById(Integer id) {

        Vegetable vegetable = vegetableRepository
                .findById(id).orElse(null);

        return vegetableVegetableDtoMapper.map(vegetable);
    }

    @Override
    public List<VegetableDto> findAll() {

        return vegetableRepository
                .findAll()
                .stream()
                .map(v -> vegetableVegetableDtoMapper.map(v))
                .collect(Collectors.toList());
    }

    @Override
    public List<VegetableDto> findAllByNameAndColourOrderByNameDesc(String name, String color) {
        return vegetableRepository.findAllByNameContainsAndColorContainsOrderByNameDesc(name, color)
                .stream()
                .map(v -> vegetableVegetableDtoMapper.map(v))
                .collect(Collectors.toList());

    }

    @Override
    public List<VegetableDto> findByName(String name) {
        return vegetableRepository.findByName(name)
                .stream()
                .map(v -> vegetableVegetableDtoMapper.map(v))
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    @Secured("ADMIN")
    public void save(Vegetable vegetable) {
        vegetableRepository.save(vegetable);
    }
}
