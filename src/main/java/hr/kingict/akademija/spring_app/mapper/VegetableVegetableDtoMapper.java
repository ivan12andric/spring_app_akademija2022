package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VegetableVegetableDtoMapper {

    @Autowired
    ManufacturerManufacturerDtoMapper manufacturerManufacturerDtoMapper;

    public VegetableDto map(Vegetable vegetable){

        if(vegetable == null){
            return null;
        }

        return VegetableDto.builder()
                .id(vegetable.getId())
                .name(vegetable.getName())
                .color(vegetable.getColor())
                .bestBefore(vegetable.getBestBefore())
                .manufacturer(manufacturerManufacturerDtoMapper.map(vegetable.getManufacturer()))
                .build();
    }
}
