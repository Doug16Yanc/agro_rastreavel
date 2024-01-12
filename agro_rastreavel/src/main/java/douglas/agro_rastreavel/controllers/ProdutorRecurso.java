package douglas.agro_rastreavel.controllers;

import douglas.agro_rastreavel.dto.produtor.AtualProdutorDto;
import douglas.agro_rastreavel.dto.produtor.ProdutorDto;
import douglas.agro_rastreavel.dto.produtor.ProdutorVisu;
import douglas.agro_rastreavel.entities.Produtor;
import douglas.agro_rastreavel.services.classes.ProdutorServiço;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtores")
public class ProdutorRecurso {
    private final ProdutorServiço produtorServiço;
    private ProdutorDto atualProdutorDto;

    public ProdutorRecurso(ProdutorServiço produtorServiço) {
        this.produtorServiço = produtorServiço;
    }

    @PostMapping
    public ResponseEntity<String> salvarProdutor(@RequestBody @Valid ProdutorDto produtorDto){
        Produtor produtor = this.produtorServiço.salvarDado(produtorDto.toEntity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Produtor " + produtor.getPrimeiroNome() + "e" + produtor.getEmail() + "salvo" +
                "com sucesso.\n");
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProdutorVisu> encontrarPorId(@PathVariable Long Id){
        Optional<Produtor> encontrado = this.produtorServiço.encontrarPorId(Id);
        if (encontrado.isPresent()){
            Produtor produtor = encontrado.get();
            ProdutorVisu produtorVisu = new ProdutorVisu(produtor);
            return ResponseEntity.status((HttpStatus.OK)).body(produtorVisu);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarProdutor(@PathVariable Long id){
        this.produtorServiço.deletarProdutor(id);
    }
    @PatchMapping
    public ResponseEntity<ProdutorVisu> atualizaProdutor(@RequestParam(value = "produtorId") Long id, @RequestBody @Valid AtualProdutorDto atualProdutorDto){
        Optional<Produtor> encontrado = this.produtorServiço.encontrarPorId(id);

        if(encontrado.isPresent()){
            Produtor produtor = encontrado.get();
            Produtor produtorAtual = atualProdutorDto.toEntity(produtor);
            Produtor produtorAtualizado = this.produtorServiço.salvarDado(produtorAtual);
            return ResponseEntity.status(HttpStatus.OK).body(new ProdutorVisu(produtorAtualizado));
        }
        else{
            return ResponseEntity.notFound().build();
        }


    }

}
