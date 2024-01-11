package douglas.agro_rastreavel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Localidade {
    @Column(nullable = false)
    private String codigo;
    @Column(nullable = false)
    private String nomeLocalidade;
    @Column(nullable = false)
    private String municipio;

    public Localidade() {
    }

    public Localidade(String codigo, String nomeLocalidade, String municipio){
        this.codigo = codigo;
        this.nomeLocalidade = nomeLocalidade;
        this.municipio = municipio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public void setNomeLocalidade(String nomeLocalidade) {
        this.nomeLocalidade = nomeLocalidade;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Localidade that)) return false;
        return Objects.equals(getCodigo(), that.getCodigo()) && Objects.equals(getNomeLocalidade(), that.getNomeLocalidade()) && Objects.equals(getMunicipio(), that.getMunicipio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNomeLocalidade(), getMunicipio());
    }
}
