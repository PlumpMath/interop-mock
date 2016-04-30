package services;

import dto.VerifyEmployeesStatusRequestDto;
import dto.VerifyEmployeesStatusResponseDto;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "VerifyEmployeeStatus")
public class VerifyEmployeesStatus {
    @WebMethod(operationName = "verifyEmployees")
    public VerifyEmployeesStatusResponseDto verifyEmployees(
            @WebParam(name = "request") VerifyEmployeesStatusRequestDto request) {
        VerifyEmployeesStatusResponseDto response = 
                new VerifyEmployeesStatusResponseDto();
        
        List<VerifyEmployeesStatusResponseDto.ResultDto> results = 
                new ArrayList<>();
        
        VerifyEmployeesStatusResponseDto.ResultDto result = 
                new VerifyEmployeesStatusResponseDto.ResultDto();
        result.setDocument("12345678");
        
        List<VerifyEmployeesStatusResponseDto.TestResultDto> tests = 
                new ArrayList<>();
        
        VerifyEmployeesStatusResponseDto.TestResultDto test1 = 
                new VerifyEmployeesStatusResponseDto.TestResultDto();
        
        test1.setComment("No problem");
        test1.setName("Test 1");
        test1.setStatus("PASS");
        
        VerifyEmployeesStatusResponseDto.TestResultDto test2 = 
                new VerifyEmployeesStatusResponseDto.TestResultDto();
        
        test2.setComment("Bad guy");
        test2.setName("Test 2");
        test2.setStatus("FAIL");
        
        tests.add(test1);
        tests.add(test2);
        
        result.setTests(tests);
        
        results.add(result);
        
        response.setResults(results);
        
        return response;
    }
}
