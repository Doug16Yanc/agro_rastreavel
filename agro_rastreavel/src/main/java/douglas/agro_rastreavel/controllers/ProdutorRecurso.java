package douglas.agro_rastreavel.controllers;

import douglas.agro_rastreavel.dto.ProdutorDto;
import douglas.agro_rastreavel.entities.Produtor;
import douglas.agro_rastreavel.services.classes.ProdutorServiço;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtores")
public class ProdutorRecurso {
    private ProdutorServiço produtorServiço;

    @PostMapping
    public ResponseEntity<String> salvarProdutor(@RequestBody @Valid ProdutorDto produtorDto){
        Produtor produtor = this.produtorServiço.salvarDado(produtorDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Produtor ${produtor.primeiroNome} e ${produtor.email} salvo" +
                "com sucesso.\n");
    }
}
