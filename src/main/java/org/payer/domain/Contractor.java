package org.payer.domain;

import org.payer.dto.EmployeeType;
import org.payer.service.EmployeePayerVisitor;
import org.payer.vo.FirstName;
import org.payer.vo.LastName;

public class Contractor extends Employee {

    private Contractor() {
        employeeType = EmployeeType.CONTRACTOR;
    }

    public Contractor(FirstName firstName, LastName lastName) {
        this();
        super.firstName = firstName;
        super.lastName = lastName;
    }

    public void accept(EmployeePayerVisitor employeePayerVisitor) {
        employeePayerVisitor.pay(this);
    }
}
