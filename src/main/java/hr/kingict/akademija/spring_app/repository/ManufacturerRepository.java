package hr.kingict.akademija.spring_app.repository;

import hr.kingict.akademija.spring_app.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
}
