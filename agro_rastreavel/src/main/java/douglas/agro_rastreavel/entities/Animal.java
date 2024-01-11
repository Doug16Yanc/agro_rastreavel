package douglas.agro_rastreavel.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "animal")
public class Animal {
    @Column(nullable = false, unique = true)
    private UUID codigoAnimal;
    @Column(nullable = false)
    private double peso;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false)

    private double percentPrenhez;
    @Column(nullable = false)

    private LocalDate desmame;
    @Column(nullable = false)

    private double indexNatal;
    @Column(nullable = false)

    private double indexMortal;

    public Animal() {
    }

    public Animal(UUID codigoAnimal, double peso, LocalDate dataNascimento, double percentPrenhez, LocalDate desmame,
                  double indexNatal, double indexMortal){
        this.codigoAnimal = codigoAnimal;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.percentPrenhez = percentPrenhez;
        this.desmame = desmame;
        this.indexNatal = indexNatal;
        this.indexMortal = indexMortal;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Double.compare(animal.getPeso(), getPeso()) == 0 && Double.compare(animal.getPercentPrenhez(), getPercentPrenhez()) == 0 && Double.compare(animal.getIndexNatal(), getIndexNatal()) == 0 && Double.compare(animal.getIndexMortal(), getIndexMortal()) == 0 && Objects.equals(getCodigoAnimal(), animal.getCodigoAnimal()) && Objects.equals(getDataNascimento(), animal.getDataNascimento()) && Objects.equals(getDesmame(), animal.getDesmame());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoAnimal(), getPeso(), getDataNascimento(), getPercentPrenhez(), getDesmame(), getIndexNatal(), getIndexMortal());
    }
}
