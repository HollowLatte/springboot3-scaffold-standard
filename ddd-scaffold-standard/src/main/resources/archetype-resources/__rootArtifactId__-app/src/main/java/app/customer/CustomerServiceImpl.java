#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.customer;

import ${package}.client.api.CustomerServiceI;
import ${package}.types.common.dto.MultiResponse;
import ${package}.types.common.dto.Response;
import ${package}.client.dto.CustomerAddCmd;
import ${package}.client.dto.CustomerListByNameQry;
import ${package}.client.dto.data.CustomerDTO;
import ${package}.app.customer.executor.CustomerAddCmdExe;
import ${package}.app.customer.executor.query.CustomerListByNameQryExe;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}