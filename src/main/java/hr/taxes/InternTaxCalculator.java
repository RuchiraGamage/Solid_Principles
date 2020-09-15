package hr.taxes;

import hr.personnel.Employee;

/**
 * Created by Ruchira on 9/15/2020.
 */
public class InternTaxCalculator implements TaxCalculator {

    private final int INCOME_TAX_PERCENTAGE = 16;

    @Override
    public double calculate(Employee employee) {
        if (employee.getMonthlyIncome() < 350)
            return 0;

        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }
}
