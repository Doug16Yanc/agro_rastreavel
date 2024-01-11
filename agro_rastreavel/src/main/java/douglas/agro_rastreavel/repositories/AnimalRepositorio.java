package douglas.agro_rastreavel.repositories;

import douglas.agro_rastreavel.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimalRepositorio extends JpaRepository<Animal, UUID> {
}
