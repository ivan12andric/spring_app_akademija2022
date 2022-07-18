package hr.kingict.akademija.spring_app.repository;

import hr.kingict.akademija.spring_app.model.Vegetable;

import java.util.List;

public interface VegetableCustomRepository {

    List<Vegetable> findByName(String name);
}
