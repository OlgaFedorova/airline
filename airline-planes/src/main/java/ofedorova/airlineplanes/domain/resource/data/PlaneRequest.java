package ofedorova.airlineplanes.domain.resource.data;

import lombok.Data;
import ofedorova.airlineplanes.domain.PlaneModel;
import ofedorova.airlineplanes.domain.Seat;

import java.util.Set;

@Data
public class PlaneRequest {

    String owner;

    PlaneModel model;

    Set<Seat> seats;

    String notes;

}
