package douglas.agro_rastreavel.controllers;

import douglas.agro_rastreavel.dto.Animal.AnimalDto;
import douglas.agro_rastreavel.entities.Animal;
import douglas.agro_rastreavel.entities.Produtor;
import douglas.agro_rastreavel.services.classes.AnimalServiço;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animais")
public class AnimalRecurso {
    private AnimalServiço animalServiço;

    @PostMapping
    public ResponseEntity<String> cadastrarAnimal(@RequestBody @Valid AnimalDto animalDto){
        Animal animal = this.animalServiço.salvarAnimal(animalDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Produtor ${produtor.primeiroNome} e ${produtor.email} salvo" +
                "com sucesso.\n");
    }

}
