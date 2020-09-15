package hr.taxes;

import hr.personnel.Employee;
import hr.personnel.FullTimeEmployee;
import hr.personnel.Intern;
import hr.personnel.PartTimeEmployee;

/**
 * Created by Ruchira on 9/15/2020.
 */
public class TaxCalculatorFactory {
    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }
        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }
        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }
        throw new RuntimeException("Invalid employee type");
    }
}
