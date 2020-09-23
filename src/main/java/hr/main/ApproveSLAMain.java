package hr.main;

import hr.documents.ServiceLicenceAgreement;
import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;
import hr.personnel.SubContractor;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ruchira on 9/23/2020.
 */
public class ApproveSLAMain {
    public static void main(String[] args) {
        int minTimeOutPercent = 98;
        int maxResolutionDays = 2;

        ServiceLicenceAgreement agreement = new ServiceLicenceAgreement(minTimeOutPercent, maxResolutionDays);

        SubContractor sb1 = new SubContractor("kamal", "kamal@gmail.com", 3000, 15);
        SubContractor sb2 = new SubContractor("Amal", "amal@gmail.com", 3000, 15);
        SubContractor sb3 = new SubContractor("Rasika", "rasika@gmail.com", 3000, 15);

        List<SubContractor> subContractors = Arrays.asList(sb1, sb2, sb3);

        for (SubContractor sub : subContractors) {
            sub.approveSLA(agreement);
        }
    }
}
