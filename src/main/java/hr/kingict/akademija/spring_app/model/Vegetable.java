package hr.kingict.akademija.spring_app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Vegetable {

    private int id;
    private String name;
    private String color;
    private Date bestBefore;

    private Date created;
    private Date lastUpdate;
    private String userCreated;
    private String userUpdated;
}
