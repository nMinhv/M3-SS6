package bt.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i <employees.length ; i++) {
            System.out.printf("Enter data employee %d \n",i+1);
            employees[i] = new Employee();
            employees[i].inputData(sc);
            employees[i].calSalary();
            System.out.printf("Employee %s salary is: %d\n",employees[i].getEmployeeName(), employees[i].getSalary());
        }
        for (Employee employee:employees
             ) {
            employee.displayData();
        }

    }
}
