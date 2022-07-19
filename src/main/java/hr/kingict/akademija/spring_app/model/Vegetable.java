package hr.kingict.akademija.spring_app.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@Entity
@Table(name = "POVRCE")
public class Vegetable extends BasicEntity  {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAZIV")
    private String name;

    @Column(name = "BOJA")
    private String color;

    @Column(name = "DATUM_DO")
    private LocalDate bestBefore;

    @ManyToOne(/*cascade = CascadeType.ALL*/)
    @JoinColumn(name = "PROIZVODJAC_ID")
    private Manufacturer manufacturer;

   /* @ManyToMany
    private Lista<Vitamin> vitamin;*/
}
