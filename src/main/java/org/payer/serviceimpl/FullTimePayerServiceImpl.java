package org.payer.serviceimpl;

import org.payer.domain.FullTimeEmployee;
import org.payer.service.PayerProviderService;

public class FullTimePayerServiceImpl implements PayerProviderService {

    private FullTimeEmployee fullTimeEmployee;

    @Override
    public void pay() {
        System.out.println(String.format("Running full time payer service for: %s %s",
                fullTimeEmployee.getFirstName().getValue(),
                fullTimeEmployee.getLastName().getValue()));
    }

    public void setFullTimeEmployee(FullTimeEmployee fullTimeEmployee) {
        this.fullTimeEmployee = fullTimeEmployee;
    }

}
