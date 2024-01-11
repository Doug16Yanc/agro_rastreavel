package douglas.agro_rastreavel.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "produtor")
public class Produtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String primeiroNome;
    @Column(nullable = false)

    private String ultimoNome;
    @Column(nullable = false)

    private String cpf;
    @Column(nullable = false)

    private String email;
    @Column(nullable = false)

    private String senha;
    @Column(nullable = false)
    @Embedded
    private Localidade  localidade;
    @Column(nullable = false)

    private List<Animal> animais;

    public Produtor() {
    }

    public Produtor(Long id, String primeiroNome, String ultimoNome, String email, String senha, Localidade localidade, List<Animal> animais){
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.email = email;
        this.senha = senha;
        this.localidade = localidade;
        this.animais = animais;
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

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtor produtor)) return false;
        return Objects.equals(getId(), produtor.getId()) && Objects.equals(getPrimeiroNome(), produtor.getPrimeiroNome()) && Objects.equals(getUltimoNome(), produtor.getUltimoNome()) && Objects.equals(getCpf(), produtor.getCpf()) && Objects.equals(getEmail(), produtor.getEmail()) && Objects.equals(getSenha(), produtor.getSenha()) && Objects.equals(getLocalidade(), produtor.getLocalidade()) && Objects.equals(getAnimais(), produtor.getAnimais());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPrimeiroNome(), getUltimoNome(), getCpf(), getEmail(), getSenha(), getLocalidade(), getAnimais());
    }
}
