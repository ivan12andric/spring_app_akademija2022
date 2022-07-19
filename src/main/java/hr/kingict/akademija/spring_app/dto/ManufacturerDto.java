package hr.kingict.akademija.spring_app.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ManufacturerDto {

    private Integer id;
    private String name;
    private List<VegetableDto> vegetableList;
}
