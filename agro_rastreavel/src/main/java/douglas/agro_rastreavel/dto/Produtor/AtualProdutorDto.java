package douglas.agro_rastreavel.dto.produtor;

import douglas.agro_rastreavel.entities.Localidade;
import douglas.agro_rastreavel.entities.Produtor;

import jakarta.validation.constraints.NotEmpty;

public class AtualProdutorDto {
    @NotEmpty(message = "Este campo não pode ser vazio.")
    private String email;

    @NotEmpty(message = "Este campo não pode ser vazio.")
    private String senha;

    @NotEmpty(message = "Este campo não pode ser vazio.")
    private Localidade localidade;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }

    public Produtor toEntity(Produtor produtor) {
        produtor.setEmail(this.email);
        produtor.setSenha(this.senha);
        produtor.setLocalidade(this.localidade);
        return produtor;
    }
}

