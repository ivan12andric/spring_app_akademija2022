package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.dto.ManufacturerDto;
import hr.kingict.akademija.spring_app.model.Manufacturer;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerManufacturerDtoMapper {

    public ManufacturerDto map(Manufacturer manufacturer){

        if(manufacturer == null){
            return null;
        }


        return ManufacturerDto.builder()
                .id(manufacturer.getId())
                .name(manufacturer.getName())
                .build();
    }
}
