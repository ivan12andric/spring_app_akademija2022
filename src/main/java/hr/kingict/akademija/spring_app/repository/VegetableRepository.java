package hr.kingict.akademija.spring_app.repository;

import hr.kingict.akademija.spring_app.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer > {
}
