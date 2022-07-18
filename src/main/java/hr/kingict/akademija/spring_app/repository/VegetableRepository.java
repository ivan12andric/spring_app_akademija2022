package hr.kingict.akademija.spring_app.repository;

import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer > {

    List<Vegetable> findAllByNameAndColorOrderByNameDesc(String name, String color);

}
