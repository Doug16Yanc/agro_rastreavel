package douglas.agro_rastreavel.services.interfaces;

import douglas.agro_rastreavel.entities.Produtor;

import java.util.Optional;

public interface EuProdutorServiço {
    Produtor salvarDado(Produtor produtor);
    public Optional<Produtor> encontrarPorId(Long id);
    void deletarProdutor(Long id);
}
