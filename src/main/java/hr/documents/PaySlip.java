package hr.documents;

import hr.personnel.Employee;

import java.time.Month;

/**
 * Created by Ruchira on 9/26/2020.
 */
public class PaySlip implements ExportableString {

    private int monthlyIncome;
    private String employeeName;
    private Month month;

    public PaySlip(Employee employee, Month month) {
        this.employeeName = employee.getFullName();
        this.monthlyIncome = employee.getMonthlyIncome();
        this.month = month;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(int monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @Override
    public String toTxt() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Month: " + this.month);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Name: " + this.employeeName);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Income: " + this.monthlyIncome);
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
