package douglas.agro_rastreavel.services.classes;

import douglas.agro_rastreavel.entities.Produtor;
import douglas.agro_rastreavel.repositories.ProdutorRepositório;
import douglas.agro_rastreavel.services.interfaces.EuProdutorServiço;

import java.util.Optional;

public class ProdutorServiço implements EuProdutorServiço {
    private ProdutorRepositório produtorRepositório;

    public Produtor salvarDado(Produtor produtor){
        this.produtorRepositório.save(produtor);
        return produtor;
    }
    public Optional<Produtor> encontrarPorId(Long id){
        Optional<Produtor> produtores = produtorRepositório.findById(id);
        if(produtores.isPresent()){
            return produtores;
        }
        else{
            throw new RuntimeException("Produtor não encontrado neste sistema.\n");
        }
    }
    public void deletarProdutor(Long id) {
        Optional<Produtor> optionalProdutor = produtorRepositório.findById(id);

        if (optionalProdutor.isPresent()) {
            Produtor produtor = optionalProdutor.get();
            produtorRepositório.delete(produtor);
        } else {
            throw new RuntimeException("Produtor não encontrado neste sistema.");
        }
    }

}
