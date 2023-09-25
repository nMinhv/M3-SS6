package bt.bt5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;
        do {
            System.out.println("1: View Student list");
            System.out.println("2: Add student");
            System.out.println("3: Edit student by id");
            System.out.println("4: Delete student by id");
            System.out.println("5: Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (Student data : students
                    ) {
                        if (data != null) {
                            data.getStudent();
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    addStudent(students, count);
                    count++;
                    break;
                case 3:
                    System.out.println("id student edit?");
                    int editId = Integer.parseInt(sc.nextLine());
                    if (students[editId - 1] != null ) {
                        students[editId - 1].inputData(editId - 1);
                    } else {
                        System.out.println("no such id");
                    }
                    break;
                case 4:
                    System.out.println("id delete?");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    if (students[deleteId - 1] != null) {
                        students[deleteId - 1] = null;
                    } else {
                        System.out.println("no such id to delete");
                    }
                    break;
                case 5: ;
                default:
                    return;
            }
        } while (choice != 5);
    }

    public static void addStudent(Student[] students, int count) {
        if (count == 100) {
            System.out.println("list is full!");
        } else {
            Student student = new Student();
            student.inputData(count + 1);
            students[count] = student;
        }
    }
}
