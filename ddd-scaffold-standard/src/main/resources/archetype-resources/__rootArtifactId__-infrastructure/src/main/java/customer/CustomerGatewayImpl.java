#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.customer;

import ${package}.domain.customer.Customer;
import ${package}.domain.customer.gateway.CustomerGateway;
import org.springframework.stereotype.Component;


@Component
public class CustomerGatewayImpl implements CustomerGateway {

    public Customer getByById(String customerId){
      // CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
