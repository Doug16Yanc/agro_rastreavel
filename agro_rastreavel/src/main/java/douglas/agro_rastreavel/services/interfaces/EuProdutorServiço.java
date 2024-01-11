package douglas.agro_rastreavel.services.interfaces;

import douglas.agro_rastreavel.entities.Produtor;

public interface EuProdutorServiço {
    static Produtor salvarDado(Produtor produtor){
        return produtor;
    }
    static Long encontrarPorId(Long id){
        return id;
    }
    static void deletarProdutor(Long id){

    }
}
