package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCollected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long userId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String status;
    private Date deliveryDt;
}
