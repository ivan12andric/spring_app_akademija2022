package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.form.ManufacturerForm;
import hr.kingict.akademija.spring_app.model.Manufacturer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ManufacturerFormManufacturerMapper {

    public Manufacturer map(ManufacturerForm manufacturerForm){

        if(manufacturerForm == null){
            return null;
        }

        return Manufacturer.builder()
                .id(manufacturerForm.getId())
                .name(manufacturerForm.getName())
                .created(LocalDate.now())
                .userCreated("dummy")
                .build();
    }
}
