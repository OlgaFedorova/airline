package ofedorova.airlineflights.domain.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ofedorova.airlineflights.domain.Flight;

public interface FlightRepository extends ReactiveCrudRepository<Flight,String>{

  Flux<Flight> findByFromCodeAndToCodeAndDepartureAtAfterAndAndArriveAtBefore(String fromCode,String toCode,LocalDateTime departure,LocalDateTime arriveAt);

}
