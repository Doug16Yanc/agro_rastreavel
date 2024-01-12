package douglas.agro_rastreavel.dto.animal;

import douglas.agro_rastreavel.entities.Animal;

import douglas.agro_rastreavel.entities.Produtor;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class AnimalDto {
    @NotNull(message = "Este campo não pode ser nulo.\n")
    private double peso;

    private LocalDate dataNascimento;

    @NotNull(message = "Este campo não pode ser nulo.\n")

    private double percentPrenhez;

    @NotNull(message = "Este campo não pode ser nulo.\n")
    private LocalDate desmame;
    @NotNull(message = "Este campo não pode ser nulo.\n")

    private double indexNatal;
    @NotNull(message = "Este campo não pode ser nulo.\n")

    private double indexMortal;
    @NotNull(message = "Este campo não pode ser nulo.\n")

    private Long produtorId;
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPercentPrenhez() {
        return percentPrenhez;
    }

    public void setPercentPrenhez(double percentPrenhez) {
        this.percentPrenhez = percentPrenhez;
    }

    public LocalDate getDesmame() {
        return desmame;
    }

    public void setDesmame(LocalDate desmame) {
        this.desmame = desmame;
    }

    public double getIndexNatal() {
        return indexNatal;
    }

    public void setIndexNatal(double indexNatal) {
        this.indexNatal = indexNatal;
    }

    public double getIndexMortal() {
        return indexMortal;
    }

    public void setIndexMortal(double indexMortal) {
        this.indexMortal = indexMortal;
    }

    public Long getProdutorId() {
        return produtorId;
    }

    public void setProdutorId(Long produtorId) {
        this.produtorId = produtorId;
    }

    public Animal toEntity() {
        Animal animal = new Animal();
        animal.setPeso(this.peso);
        animal.setDataNascimento(this.dataNascimento);
        animal.setPercentPrenhez(this.percentPrenhez);
        animal.setDesmame(this.desmame);
        animal.setIndexNatal(this.indexNatal);
        animal.setIndexMortal(this.indexMortal);
        Produtor produtor = new Produtor();
        produtor.setId(this.produtorId);
        return animal;
    }
}
