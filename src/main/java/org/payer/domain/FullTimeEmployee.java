package org.payer.domain;

import org.payer.dto.EmployeeType;
import org.payer.service.EmployeePayerVisitor;
import org.payer.vo.FirstName;
import org.payer.vo.LastName;

public class FullTimeEmployee extends Employee {

    private FullTimeEmployee() {
        employeeType = EmployeeType.STUDENT;
    }

    public FullTimeEmployee(FirstName firstName, LastName lastName) {
        this();
        super.firstName = firstName;
        super.lastName = lastName;
    }

    public void accept(EmployeePayerVisitor employeePayerVisitor) {
        employeePayerVisitor.pay(this);
    }
}
