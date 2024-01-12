package douglas.agro_rastreavel.dto.produtor;

import douglas.agro_rastreavel.entities.Localidade;
import douglas.agro_rastreavel.entities.Produtor;

import jakarta.persistence.Embedded;

public class ProdutorDto {
    private Long id;
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;
    private String email;
    @Embedded
    private Localidade localidade;

    public ProdutorDto() {
    }

    public Produtor toEntity() {
        Produtor produtor = new Produtor();
        this.id = produtor.getId();
        this.primeiroNome = produtor.getPrimeiroNome();
        this.ultimoNome = produtor.getUltimoNome();
        this.cpf = produtor.getCpf();
        this.email = produtor.getEmail();
        this.localidade = produtor.getLocalidade();
        return produtor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Localidade getLocalidade() {
        return localidade;
    }

    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
}
