package douglas.agro_rastreavel.services.interfaces;

import douglas.agro_rastreavel.entities.Animal;

import java.util.UUID;

public interface EuAnimalServiço {
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
