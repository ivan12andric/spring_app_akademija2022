package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.form.VegetableForm;
import hr.kingict.akademija.spring_app.model.Manufacturer;
import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VegetableFormVegetableMapper {

    @Autowired
    ManufacturerFormManufacturerMapper manufacturerFormManufacturerMapper;

    public Vegetable map(VegetableForm vegetableForm){

        if(vegetableForm == null){
            return null;
        }

        return Vegetable.builder()
                .id(vegetableForm.getId())
                .name(vegetableForm.getName())
                .color(vegetableForm.getColor())
                .bestBefore(vegetableForm.getBestBefore())
                .manufacturer(manufacturerFormManufacturerMapper.map(vegetableForm.getManufacturer()))
                .created(LocalDate.now())
                .userCreated("dummy")
                .build();
    }
}
