package hr.kingict.akademija.spring_app.mapper;

import hr.kingict.akademija.spring_app.form.VegetableForm;
import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VegetableFormVegetableMapper {

    public Vegetable map(VegetableForm vegetableForm){
        return Vegetable.builder()
                .id(vegetableForm.getId())
                .name(vegetableForm.getName())
                .color(vegetableForm.getColor())
                .bestBefore(vegetableForm.getBestBefore())
                .created(LocalDate.now())
                .userCreated("dummy")
                .build();
    }
}
