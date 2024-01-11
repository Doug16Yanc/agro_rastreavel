package douglas.agro_rastreavel.services.classes;

import douglas.agro_rastreavel.entities.Animal;
import douglas.agro_rastreavel.entities.Produtor;
import douglas.agro_rastreavel.repositories.AnimalRepositorio;
import douglas.agro_rastreavel.services.interfaces.EuAnimalServiço;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AnimalServiço implements EuAnimalServiço {

    private AnimalRepositorio animalRepositorio;

    static Animal salvarAnimal(Animal animal){
        return animal;
    }
    static Long encontrarPorProdutor(Long produtor){
        return produtor;
    }
    static UUID encontrarAnimal(Long produtor, UUID animal){
        return animal;
    }

}
