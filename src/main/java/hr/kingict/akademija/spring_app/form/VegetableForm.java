package hr.kingict.akademija.spring_app.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
//@Component
public class VegetableForm {

    private Integer id;
    @Size(min = 3, max = 10)
    private String name;
    @NotNull(message = "Boja je obavezna")
    private String color;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate bestBefore;
}
