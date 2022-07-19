package hr.kingict.akademija.spring_app.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "PROIZVODJAC")
public class Manufacturer {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAZIV")
    private String name;

    @Column(name = "DATUM_KREIRANJA")
    private LocalDate created;

    @Column(name = "DATUM_AZURIRANJA")
    private LocalDate lastUpdate;

    @Column(name = "KREIRAO")
    private String userCreated;

    @Column(name = "AZURIRAO")
    private String userUpdated;

}
