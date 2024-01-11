package douglas.agro_rastreavel.dto.Animal;

import douglas.agro_rastreavel.entities.Animal;

import java.time.LocalDate;
import java.util.UUID;

public class AnimalVisu {
    private UUID codigoAnimal;
    private double peso;
    private LocalDate dataNascimento;
    private double percentPrenhez;
    private LocalDate desmame;
    private double indexNatal;
    private double indexMortal;

    public AnimalVisu(Animal animal) {
        this.codigoAnimal = animal.getCodigoAnimal();
        this.peso = animal.getPeso();
        this.dataNascimento = animal.getDataNascimento();
        this.percentPrenhez = animal.getPercentPrenhez();
        this.desmame = animal.getDesmame();
        this.indexNatal = animal.getIndexNatal();
        this.indexMortal = animal.getIndexMortal();
    }

    public UUID getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(UUID codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

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
}
