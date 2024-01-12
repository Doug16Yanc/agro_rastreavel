package douglas.agro_rastreavel.controllers;

import douglas.agro_rastreavel.dto.animal.AnimalDto;
import douglas.agro_rastreavel.dto.animal.AnimalVisu;
import douglas.agro_rastreavel.dto.animal.AnimalVisuList;
import douglas.agro_rastreavel.entities.Animal;
import douglas.agro_rastreavel.services.classes.AnimalServiço;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animais")
public class AnimalRecurso {
    private AnimalServiço animalServiço;

    @PostMapping
    public ResponseEntity<String> cadastrarAnimal(@RequestBody @Valid AnimalDto animalDto){
        Animal animal = this.animalServiço.salvarAnimal(animalDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Produtor " + animal.getCodigoAnimal() + " salvo" +
                "com sucesso.\n");
    }
    @GetMapping
    public ResponseEntity<List<AnimalVisuList>> encontrarPorTodoProdutor(@RequestParam(value = "produtorId") Long id){
        List<AnimalVisuList> animalVisuList = this.animalServiço.encontrarTudoPorProdutor(id).stream().map(animal ->
                new AnimalVisuList(animal)).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.OK).body(animalVisuList);
    }
    @GetMapping("{/codigoAnimal}")
    public ResponseEntity<AnimalVisu> encontrarAnimalPorCodigo(@RequestParam(value = "produtorId") Long id, @PathVariable UUID codigoAnimal){
        Animal animal = this.animalServiço.encontrarAnimal(id, codigoAnimal);
        return ResponseEntity.status(HttpStatus.OK).body(new AnimalVisu(animal));
    }
}
