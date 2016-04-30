package services;

import dto.PostulateEmployeeRequestDto;
import dto.PostulateEmployeeResponseDto;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "PostulateEmployee")
public class PostulateEmployee {
    @WebMethod(operationName = "postulate")
    public PostulateEmployeeResponseDto postulate(
            @WebParam(name = "request") PostulateEmployeeRequestDto request) {
        PostulateEmployeeResponseDto response = new PostulateEmployeeResponseDto();
        
        response.setSuccess(true);
        response.setErrorMessage(null);
        
        return response;
    }
}