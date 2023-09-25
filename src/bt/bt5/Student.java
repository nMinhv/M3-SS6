package bt.bt5;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int studentID, studentAge;
    private String studentName, studentGender, studentAddress;

    public Student() {
    }

    public Student(int studentID, int studentAge, String studentName, String studentGender, String studentAddress) {
        this.studentID = studentID;
        this.studentAge = studentAge;
        this.studentAddress = studentAddress;
        this.studentGender = studentGender;
        this.studentName = studentName;
    }

    public void inputData(int id) {
        studentID = id;
        System.out.println("New Student Name:");
        studentName = sc.nextLine();
        System.out.println("New Student Address");
        studentAddress = sc.nextLine();
        System.out.println("New Student Gender male/female");
        boolean isGender = false;
        while (!isGender) {
            studentGender = sc.nextLine();
            if (studentGender.equals("male")) {
                isGender = true;
            } else if (studentGender.equals("female")) {
                isGender = true;
            }else {
                System.out.println("Gender?");
            }        }
        System.out.println("New Student Age");
        studentAge = Integer.parseInt(sc.nextLine());
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void getStudent() {
        System.out.printf("ID: %d Name %s Age: %d Address Sex: %s", studentID, studentName, studentAge, studentAddress, studentGender);
        System.out.println();
    }
}
