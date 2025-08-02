#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.domain.order.model.entity;

import ${package}.domain.order.model.valobj.TradeOrderState;
import java.math.BigDecimal;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TradeOrderEntity {

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 买家id
     */
    private String buyerId;

    /**
     * 卖家id
     */
    private String sellerId;

    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 商品数量
     */
    private Integer itemCount;

    /**
     * 商品Id
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 订单状态
     */
    private TradeOrderState orderState;
}
