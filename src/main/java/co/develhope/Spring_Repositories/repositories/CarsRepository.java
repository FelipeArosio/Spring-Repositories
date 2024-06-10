package co.develhope.Spring_Repositories.repositories;

import co.develhope.Spring_Repositories.entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository <Cars, Long> {
}
