package hr.kingict.akademija.spring_app.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VegetableDto {

    private int id;
    private String name;
    private String color;
    private Date bestBefore;
}
