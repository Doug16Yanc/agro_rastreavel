package douglas.agro_rastreavel.services.classes;

import douglas.agro_rastreavel.entities.Animal;
import douglas.agro_rastreavel.repositories.AnimalRepositorio;
import douglas.agro_rastreavel.services.interfaces.EuAnimalServiço;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnimalServiço implements EuAnimalServiço {

    private final AnimalRepositorio animalRepositorio;

    public AnimalServiço(AnimalRepositorio animalRepositorio) {
        this.animalRepositorio = animalRepositorio;
    }

    public Animal salvarAnimal(Animal animal){
        this.animalRepositorio.save(animal);
        return animal;
    }
    public List<Animal> encontrarTudoPorProdutor(Long produtor){
        return animalRepositorio.findAllById(produtor);
    }
    public Animal encontrarAnimal(Long produtor, UUID animal){
        Optional<Animal> encontrado = Optional.ofNullable(this.animalRepositorio.findByProdutorAndByAnimal(produtor, animal);

        if(encontrado.isPresent()){
            return encontrado.get();
        }
        else {
            throw new RuntimeException("Animal ${animal.id} encontrado, porém não registrado para" +
                "o produtor ${produtor.nome}? Suspeita de algo errado? Entre em contato com os administradores," +
                "por favor.\n");
        }
    }

}
