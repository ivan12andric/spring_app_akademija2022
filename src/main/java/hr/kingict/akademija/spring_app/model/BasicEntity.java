package hr.kingict.akademija.spring_app.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@MappedSuperclass
public class BasicEntity {

    @Column(name = "DATUM_KREIRANJA")
    private LocalDate created;

    @Column(name = "DATUM_AZURIRANJA")
    private LocalDate lastUpdate;

    @Column(name = "KREIRAO")
    private String userCreated;

    @Column(name = "AZURIRAO")
    private String userUpdated;

}
