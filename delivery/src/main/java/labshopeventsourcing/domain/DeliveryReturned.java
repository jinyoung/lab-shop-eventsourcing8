package labshopeventsourcing.domain;

import labshopeventsourcing.domain.*;
import labshopeventsourcing.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;

    public DeliveryReturned(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryReturned(){
        super();
    }
}
