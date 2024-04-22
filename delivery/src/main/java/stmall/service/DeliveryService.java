package stmall.service;

import java.util.List;
import java.util.Optional;
import stmall.domain.*;

public interface DeliveryService {
    List<Delivery> getAllDeliveries() throws Exception;
    Optional<Delivery> getDeliveryById(Long id) throws Exception;
    Delivery createDelivery(Delivery delivery) throws Exception;
    Delivery updateDelivery(Delivery delivery) throws Exception;
    void deleteDelivery(Long id) throws Exception;

    Delivery completeDelivery(CompleteDeliveryCommand completeDeliveryCommand)
        throws Exception;
    Delivery completeReturn(CompleteReturnCommand completeReturnCommand)
        throws Exception;
}
