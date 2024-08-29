package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Long productId;
    private Integer qty;
    private String status;

    public DeliveryCancled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancled() {
        super();
    }
}
//>>> DDD / Domain Event
