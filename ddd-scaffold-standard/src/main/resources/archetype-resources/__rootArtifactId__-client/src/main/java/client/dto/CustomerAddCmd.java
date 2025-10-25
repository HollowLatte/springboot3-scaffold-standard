#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.dto;

import ${package}.client.dto.data.CustomerDTO;
import lombok.Data;

@Data
public class CustomerAddCmd {

    private CustomerDTO customerDTO;

}
