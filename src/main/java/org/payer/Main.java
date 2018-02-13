package org.payer;

import org.payer.domain.Contractor;
import org.payer.domain.Employee;
import org.payer.domain.FullTimeEmployee;
import org.payer.domain.Student;
import org.payer.serviceimpl.PaymentServiceImpl;
import org.payer.vo.FirstName;
import org.payer.vo.LastName;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Collection<Employee> employeeCollection = Arrays.asList(

                new Student(
                        new FirstName("Adam"),
                        new LastName("Nowak")
                ),

                new Student(
                        new FirstName("Patryk"),
                        new LastName("Nowak")
                ),

                new Contractor(
                        new FirstName("Jurek"),
                        new LastName("Marek")
                ),

                new FullTimeEmployee(
                        new FirstName("Monika"),
                        new LastName("Zamojska")
                )
        );

        employeeCollection.stream().forEach(e -> e.accept(new PaymentServiceImpl()));
    }
}
