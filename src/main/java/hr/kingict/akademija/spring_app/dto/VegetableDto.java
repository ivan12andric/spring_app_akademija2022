package hr.kingict.akademija.spring_app.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VegetableDto {

    private Integer id;
    private String name;
    private String color;
    private LocalDate bestBefore;
}
