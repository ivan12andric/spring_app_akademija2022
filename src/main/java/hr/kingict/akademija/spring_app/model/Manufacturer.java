package hr.kingict.akademija.spring_app.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@Entity
@Table(name = "PROIZVODJAC")
public class Manufacturer extends BasicEntity {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAZIV")
    private String name;

    @OneToMany
    private List<Vegetable> vegetableList;
}
