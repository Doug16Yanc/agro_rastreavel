package douglas.agro_rastreavel.dto.Produtor;

import douglas.agro_rastreavel.entities.Localidade;
import douglas.agro_rastreavel.entities.Produtor;
import jakarta.persistence.*;

import java.util.Optional;

public class ProdutorVisu {
    private Long id;
    private String primeiroNome;

    private String ultimoNome;

    private String cpf;

    private String email;
    @Embedded
    private Localidade localidade;

    public ProdutorVisu(){

    }
    public ProdutorVisu(Produtor produtor){
        this.id = produtor.getId();
        this.primeiroNome = produtor.getPrimeiroNome();
        this.ultimoNome = produtor.getUltimoNome();
        this.cpf = produtor.getCpf();
        this.email = produtor.getEmail();
        this.localidade = produtor.getLocalidade();
    }

}
