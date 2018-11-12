package ofedorova.airlineplanes.domain.repository;

import ofedorova.airlineplanes.domain.Plane;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaneRepository extends ReactiveCrudRepository<Plane,String> {
}
