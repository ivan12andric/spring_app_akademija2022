package hr.kingict.akademija.spring_app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "POVRCE")
public class Vegetable {

    @Id
    @Column
    private Integer id;

    @Column(name = "NAZIV")
    private String name;

    @Column(name = "BOJA")
    private String color;

    @Column(name = "DATUM_DO")
    private LocalDate bestBefore;

    @Column(name = "DATUM_KREIRANJA")
    private LocalDate created;

    @Column(name = "DATUM_AZURIRANJA")
    private LocalDate lastUpdate;

    @Column(name = "KREIRAO")
    private String userCreated;

    @Column(name = "AZURIRAO")
    private String userUpdated;
}
