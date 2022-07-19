package hr.kingict.akademija.spring_app.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ManufacturerDto {

    private Integer id;
    private String name;
}
