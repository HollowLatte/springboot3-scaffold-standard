package ${package}.types.event;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * 基础事件
 */
@Data
public class BaseEvent<T> implements Serializable {
    /**
     * 唯一ID，用于幂等性校验
     */
    private String messageId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 实际业务数据
     */
    private T data;

    private BaseEvent() {
    }

    public static <T> BaseEvent<T> of(T data) {
        BaseEvent<T> message = new BaseEvent<>();
        message.messageId = UUID.randomUUID().toString();
        message.createTime = new Date();

        message.data = data;
        return message;
    }
}
