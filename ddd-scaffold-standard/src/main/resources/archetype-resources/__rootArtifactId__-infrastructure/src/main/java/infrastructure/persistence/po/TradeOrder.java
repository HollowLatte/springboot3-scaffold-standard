package ${package}.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableName;
import ${package}.infrastructure.common.po.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@TableName("trade_order")
@EqualsAndHashCode(callSuper = true)
public class TradeOrder extends BasePO {

    private String orderId;

    private String buyerId;

    private String orderState;

}
