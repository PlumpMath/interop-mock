package dto;

import java.io.Serializable;
import java.util.List;

public class VerifyEmployeesStatusRequestDto implements Serializable {
    private List<String> employees;

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }
}
