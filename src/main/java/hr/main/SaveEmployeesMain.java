package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;
import hr.taxes.TaxCalculator;
import hr.taxes.TaxCalculatorFactory;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
        List<Employee> employees = repository.findAll();

        //calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        double totalTaxes = 0;
        for (Employee e : employees) {
            TaxCalculator taxCalculator = TaxCalculatorFactory.create(e);
            double tax = taxCalculator.calculate(e);
            totalTaxes += tax;

            String formattedTax= currencyFormatter.format(tax);
            consoleLogger.writeInfo(e.getFullName()+" taxes : "+formattedTax);
        }

        consoleLogger.writeInfo("Total taxes : "+totalTaxes);
    }
}
