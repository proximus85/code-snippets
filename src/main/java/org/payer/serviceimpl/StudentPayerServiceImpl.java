package org.payer.serviceimpl;

import org.payer.domain.Student;
import org.payer.service.PayerProviderService;

public class StudentPayerServiceImpl implements PayerProviderService {

    private Student student;

    public void pay() {
        System.out.println(String.format("Running student payer service for: %s %s",
                student.getFirstName().getValue(),
                student.getLastName().getValue()));
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
