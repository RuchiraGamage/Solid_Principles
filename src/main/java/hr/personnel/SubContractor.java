package hr.personnel;

import hr.documents.ServiceLicenceAgreement;

/**
 * Created by Ruchira on 9/23/2020.
 */

// subcontractor is not a employee so cant extend employee functions because if we find subcontractor as employee and if subcontractor don't have employee
//functionality it will break at some point
//so we break the relationship treat SubContractor as separate object as it can't substitute employee completely

public class SubContractor extends Employee {
    private final int monthlyIncome;
    private int nbHoursPerWeek;
    private String email;
    private String name;

    public SubContractor(String name,
                         String email,
                         int nbHoursPerWeek,
                         int monthlyIncome) {
        this.name = name;
        this.email = email;
        this.nbHoursPerWeek = nbHoursPerWeek;
        this.monthlyIncome = monthlyIncome;
    }

    public boolean approveSLA(ServiceLicenceAgreement sla) {
        boolean result = false;
        if (sla.getMinTimeOutPercent() >= 98 && sla.getMaxResolutionDays() <= 2) {
            result = true;
        }
        System.out.println("SLA approval for " + this.name + " : " + result);
        return result;
    }
}
