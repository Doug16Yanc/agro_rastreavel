package douglas.agro_rastreavel.repositories;

import douglas.agro_rastreavel.entities.Produtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutorRepositório extends JpaRepository<Produtor, Long> {
}
