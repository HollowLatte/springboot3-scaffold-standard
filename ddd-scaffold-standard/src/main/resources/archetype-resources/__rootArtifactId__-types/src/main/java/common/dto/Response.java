package ${package}.common.dto;

import lombok.Data;

/**
 * Response to caller
 */
@Data
public class Response extends DTO {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private String errCode;

    private String errMessage;

    public static Response buildSuccess() {
        Response response = new Response();
        response.setSuccess(true);
        return response;
    }

    public static Response buildFailure(String errCode, String errMessage) {
        Response response = new Response();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }

}
