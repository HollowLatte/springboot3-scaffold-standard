package ${package}.adapter.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestCustomer {

    // @RabbitListener(queuesToDeclare = {@Queue("test.queue")})
    public void receive(String message) {
        log.info("Received message: {}", message);
    }

}
