package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the employee file to process: ");
        String inputFile = read.nextLine();

        System.out.print("Enter the payroll file to create: ");
        String outputFile = read.nextLine();

        FileReader fileReader = new FileReader("src/main/resources/" + inputFile);
        BufferedReader reader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("id|name|gross pay");
        writer.newLine();
        reader.readLine();

        String line;
        List<Employee> employeeList = new ArrayList<>();

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




