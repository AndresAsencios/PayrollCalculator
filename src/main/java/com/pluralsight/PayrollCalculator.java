package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/resources/employees.csv");
        BufferedReader reader = new BufferedReader(fileReader);
        reader.readLine();

        String line;

        System.out.println("Employee Payroll Report");
        System.out.printf("%-6s %-22s %12s%n","ID", "NAME", "GROSS PAY");
        System.out.println("--------------------------------");

        while ((line = reader.readLine()) != null) {
            String[] token = line.split("\\|");
            String employeeId = token[0];
            String name = token[1];
            double hoursWorked = Double.parseDouble(token[2]);
            double payRate = Double.parseDouble(token[3]);

            Employee employee1 =
                    new Employee(employeeId, payRate, hoursWorked, name);

            System.out.printf("%-6s %-22s $%11.2f%n",
                    employee1.getEmployeeId(),
                    employee1.getName(),
                    employee1.getGrossPay());

        }

        reader.close();
    }
}




