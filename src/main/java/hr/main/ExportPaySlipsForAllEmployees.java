package hr.main;

import hr.documents.PaySlip;
import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;

import java.time.Month;
import java.util.List;

/**
 * Created by Ruchira on 9/26/2020.
 */
public class ExportPaySlipsForAllEmployees {
    public static void main(String[] args) {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        List<Employee> employees = repository.findAll();

        for (Employee emp : employees) {
            PaySlip paySlip = new PaySlip(emp, Month.AUGUST);
            String info = paySlip.toTxt();
            System.out.println(info);
        }
    }
}
