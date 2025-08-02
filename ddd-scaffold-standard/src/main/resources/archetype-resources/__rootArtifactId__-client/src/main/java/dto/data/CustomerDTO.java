#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dto.data;

import lombok.Data;

@Data
public class CustomerDTO{
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    private String companyName;
    private String source;
}
