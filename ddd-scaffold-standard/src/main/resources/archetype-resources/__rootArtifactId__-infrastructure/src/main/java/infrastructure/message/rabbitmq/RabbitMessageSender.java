package ${package}.infrastructure.message.rabbitmq;

import com.alibaba.fastjson2.JSON;
import ${package}.types.event.BaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMessageSender {

    @Lazy
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 发送消息
     */
    public <T> void send(String exchange, String routingKey, T payload) {
        BaseEvent<T> message = BaseEvent.of(payload);

        try {
            String jsonString = JSON.toJSONString(message);
            rabbitTemplate.convertAndSend(exchange, routingKey, jsonString);
        } catch (Exception e) {
            log.error("Failed to send message: {}", e.getMessage(), e);
        }
    }

    /**
     * 发送消息到默认exchange
     */
    public <T> void send(String routingKey, T payload) {
        send("", routingKey, payload);
    }

}
