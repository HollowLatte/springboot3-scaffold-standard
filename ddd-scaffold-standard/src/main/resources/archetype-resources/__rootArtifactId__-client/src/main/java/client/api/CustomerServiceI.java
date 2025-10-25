#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.api;

import ${package}.types.common.dto.MultiResponse;
import ${package}.types.common.dto.Response;
import ${package}.client.dto.CustomerAddCmd;
import ${package}.client.dto.CustomerListByNameQry;
import ${package}.client.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
