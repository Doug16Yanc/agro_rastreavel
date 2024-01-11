package douglas.agro_rastreavel.dto.Produtor;

import douglas.agro_rastreavel.entities.Localidade;
import douglas.agro_rastreavel.entities.Produtor;
import jakarta.validation.constraints.NotEmpty;

import java.util.Optional;

public class AtualProdutorDto {
    @NotEmpty(message = "Este campo não pode ser vazio.")
    private String email;
    @NotEmpty(message = "Este campo não pode ser vazio.")

    private String senha;

    @NotEmpty(message = "Este campo não pode ser vazio.")

    private Localidade localidade;

    public Produtor toEntity(Produtor produtor){
        produtor.setEmail(this.email);
        produtor.setSenha(this.senha);
        produtor.setLocalidade(this.localidade);
        return produtor;
    }

}
