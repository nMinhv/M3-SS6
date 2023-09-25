package bt.bt6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gen;
    private int rate;
    private long salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, int rate, long salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGen() {
        return gen;
    }
    public void setGen(boolean gen) {
        this.gen = gen;
    }
    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public void inputData(Scanner sc) {
        System.out.print("Employee ID:");
        this.employeeId = sc.nextLine();
        System.out.print("Employee Name:");
        this.employeeName = sc.nextLine();
        System.out.print("Employee Age:");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Employee rate:");
        this.rate = Integer.parseInt(sc.nextLine());
        System.out.print("Employee Gender(true 'male'/false 'female'):");
        boolean isDone = false;
        do {
        String gender = sc.nextLine();
            if (gender.equals("male") | gender.equals("true")) {
                this.gen = true;
                isDone = true;
            } else if (gender.equals("female") | gender.equals("false")) {
                this.gen = false;
                isDone = true;
            }else {
                System.out.println("confirm employee sex again");
            }
        }while (!isDone);

    }
   public void calSalary() {
         this.salary = this.rate * 1300000L;
   }
    public void displayData() {
        System.out.printf("ID: %s - Name: %s Age: %d\n", this.employeeId, this.employeeName, this.age);
        System.out.printf("Sex: %s - rate: %d Salary: %d\n", this.gen ? "male" : "female", this.rate, this.salary);
    }
}
