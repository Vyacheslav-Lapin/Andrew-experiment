package ru.vlapin.experiments.Andrewexperiment.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.Andrewexperiment.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
