package org.payer.domain;

import org.payer.dto.EmployeeType;
import org.payer.service.EmployeePayerVisitor;
import org.payer.vo.FirstName;
import org.payer.vo.LastName;

public class Student extends Employee {

    private Student() {
        employeeType = EmployeeType.STUDENT;
    }

    public Student(FirstName firstName, LastName lastName) {
        this();
        super.firstName = firstName;
        super.lastName = lastName;
    }

    @Override
    public void accept(EmployeePayerVisitor employeePayerVisitor) {
        employeePayerVisitor.pay(this);
    }
}
