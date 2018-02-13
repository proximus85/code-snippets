package org.payer.domain;

import org.payer.dto.EmployeeType;
import org.payer.service.EmployeePayerService;
import org.payer.vo.FirstName;
import org.payer.vo.LastName;

public abstract class Employee implements EmployeePayerService {

    protected EmployeeType employeeType;
    protected FirstName firstName;
    protected LastName lastName;

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public LastName getLastName() {
        return lastName;
    }
}
