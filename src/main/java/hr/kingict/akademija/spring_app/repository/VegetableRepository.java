package hr.kingict.akademija.spring_app.repository;

import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer >, VegetableCustomRepository {

    List<Vegetable> findAllByNameContainsAndColorContainsOrderByNameDesc(String name, String color);

}
