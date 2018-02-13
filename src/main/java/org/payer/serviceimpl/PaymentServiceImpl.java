package org.payer.serviceimpl;

import org.payer.domain.Contractor;
import org.payer.domain.FullTimeEmployee;
import org.payer.domain.Student;
import org.payer.service.EmployeePayerVisitor;

public class PaymentServiceImpl implements EmployeePayerVisitor {

    static StudentPayerServiceImpl studentPayerService = null;
    static ContractorPayerServiceImpl contractorPayerService = null;
    static FullTimePayerServiceImpl fullTimePayerService = null;

    static {
        studentPayerService = new StudentPayerServiceImpl();
        contractorPayerService = new ContractorPayerServiceImpl();
        fullTimePayerService = new FullTimePayerServiceImpl();
    }

    @Override
    public void pay(Student student) {
        studentPayerService.setStudent(student);
        studentPayerService.pay();
    }

    @Override
    public void pay(Contractor contractor) {
        contractorPayerService.setContractor(contractor);
        contractorPayerService.pay();
    }

    @Override
    public void pay(FullTimeEmployee fullTimeEmployee) {
        fullTimePayerService.setFullTimeEmployee(fullTimeEmployee);
        fullTimePayerService.pay();
    }
}
