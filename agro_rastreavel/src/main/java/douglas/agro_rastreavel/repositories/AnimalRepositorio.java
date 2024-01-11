package douglas.agro_rastreavel.repositories;

import douglas.agro_rastreavel.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AnimalRepositorio extends JpaRepository<Animal, UUID> {
    @Query("SELECT animal FROM Animal animal WHERE animal.id = :animalId")
    List<Animal> findAllById(Long produtor);

    Animal findByProdutorAndByAnimal(Long produtor, UUID animal);
}
