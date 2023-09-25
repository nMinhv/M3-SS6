package ra.imp;

import ra.entity.Student;

import java.util.Scanner;

public class StudentImp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Syntax: ClassName objectName = new constructor;
        // khởi tạo đối tượng student1 mà không khởi tạo bất cứ thông ti gì
        Student student1 = new Student();
        System.out.println("Enter Student 1 information:");
        student1.inputData(scanner);
        // khởi tạo id và tên
        Student student2 = new Student("SV002","Nguyễn Văn B", 25, true,"Hanoi",true);
        Student student3 = new Student();
        System.out.println("Enter student 3 age:");
        student3.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter student 3 sex:");
        student3.setSex(Boolean.parseBoolean(scanner.nextLine()));
        int s1Age = student1.getAge();
        int s2Age = student2.getAge();
        int s3Age = student3.getAge();
        int averageAge = (int) (s1Age + s2Age + s3Age)/3;
        System.out.println("Average Age of student is: " + averageAge );
        System.out.println("Student 1 Information :");
        student1.displayData();
        System.out.println("Student 2 Information:");
        student2.displayData();
    }
}
