package org.payer.service;

import org.payer.domain.Contractor;
import org.payer.domain.FullTimeEmployee;
import org.payer.domain.Student;

public interface EmployeePayerVisitor {

    void pay(Student student);

    void pay(Contractor contractor);

    void pay(FullTimeEmployee fullTimeEmployee);

}
