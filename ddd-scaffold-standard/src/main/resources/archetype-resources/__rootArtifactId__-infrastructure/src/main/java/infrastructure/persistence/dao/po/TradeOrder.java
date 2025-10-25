package ${package}.infrastructure.persistence.dao.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("trade_order")
public class TradeOrder {

    @TableId
    private Long id;

    private String orderId;

    private String buyerId;

    private Date createTime;

    private String orderState;

    private Boolean isDeleted;
}
