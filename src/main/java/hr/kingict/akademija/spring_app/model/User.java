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
@Table(name = "KORISNICI")
public class User extends BasicEntity {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "KORISNICKO_IME")
    private String username;

    @Column(name = "LOZINKA")
    private String password;

    @Column(name = "ROLA")
    private String role;
}
