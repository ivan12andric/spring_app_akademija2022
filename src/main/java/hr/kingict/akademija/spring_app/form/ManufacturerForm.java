package hr.kingict.akademija.spring_app.form;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class ManufacturerForm {

    private Integer id;
    @Size(min = 5, max = 10)
    private String name;
}
