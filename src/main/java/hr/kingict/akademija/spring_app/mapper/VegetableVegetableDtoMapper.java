package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.dto.VegetableDto;
import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.stereotype.Component;

@Component
public class VegetableVegetableDtoMapper {

    public VegetableDto map(Vegetable vegetable){
        return VegetableDto.builder()
                .id(vegetable.getId())
                .name(vegetable.getName())
                .color(vegetable.getColor())
                .bestBefore(vegetable.getBestBefore())
                .build();
    }
}
