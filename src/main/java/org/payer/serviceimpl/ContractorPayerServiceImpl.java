package org.payer.serviceimpl;

import org.payer.domain.Contractor;
import org.payer.service.PayerProviderService;

public class ContractorPayerServiceImpl implements PayerProviderService {

    private Contractor contractor;

    @Override
    public void pay() {
        System.out.println(String.format("Running contractor payer service for: %s %s",
                contractor.getFirstName().getValue(),
                contractor.getLastName().getValue()));
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }
}
