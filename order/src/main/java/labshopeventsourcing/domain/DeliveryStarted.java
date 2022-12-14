package labshopeventsourcing.domain;

import labshopeventsourcing.domain.*;
import labshopeventsourcing.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;
    private Long orderId;
}


