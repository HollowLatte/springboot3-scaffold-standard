#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.app.customer.executor;

import ${package}.types.common.dto.Response;
import ${package}.client.dto.CustomerAddCmd;
import org.springframework.stereotype.Component;


@Component
public class CustomerAddCmdExe {

    public Response execute(CustomerAddCmd cmd) {
        // The flow of usecase is defined here.
        // The core ablility should be implemented in Domain. or sink to Domian gradually
        if (cmd.getCustomerDTO().getCompanyName().equals("ConflictCompanyName")) {
            throw new RuntimeException("公司名冲突");
        }
        return Response.buildSuccess();
    }

}
