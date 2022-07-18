package hr.kingict.akademija.spring_app.repository.impl;

import hr.kingict.akademija.spring_app.model.Vegetable;
import hr.kingict.akademija.spring_app.repository.VegetableCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class VegetableCustomRepositoryImpl implements VegetableCustomRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Vegetable> findByName(String name) {
        return entityManager
                .createQuery("select v from Vegetable v where v.name = :name", Vegetable.class)
                .setParameter("name", name)
                .getResultList();

    }
}
