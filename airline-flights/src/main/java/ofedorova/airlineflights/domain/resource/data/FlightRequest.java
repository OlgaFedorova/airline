package ofedorova.airlineflights.domain.resource.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import ofedorova.airlineflights.domain.Airport;
import ofedorova.airlineflights.domain.Connection;

import java.util.Set;
import ofedorova.airlineflights.domain.RegularPrice;

@Data
public class FlightRequest {

  Airport from;

  Airport to;

  @JsonProperty("departure_at")
  String departureAt;

  @JsonProperty("arrive_at")
  String arriveAt;

  @JsonProperty("plane_id")
  String planeId;

  Set<Connection> connections;

  Set<RegularPrice> prices;

}
