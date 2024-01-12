package douglas.agro_rastreavel.exceptions;

import java.time.LocalDateTime;
import java.util.Map;

public class DetalhesExceções {
    private String titulo;
    private LocalDateTime timestamp;
    private int status;
    private String excecao;
    private Map<String, String> detalhes;
    public DetalhesExceções(String titulo, LocalDateTime timestamp, int status, String excecao, Map<String, String> detalhes){
        this.titulo = titulo;
        this.timestamp = timestamp;
        this.status = status;
        this.excecao = excecao;
        this.detalhes = detalhes;
    }

    public DetalhesExceções(Map<String, String> erros) {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String getExcecao() {
        return excecao;
    }

    public void setExcecao(String excecao) {
        this.excecao = excecao;
    }

    public Map<String, String> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Map<String, String> detalhes) {
        this.detalhes = detalhes;
    }
}
