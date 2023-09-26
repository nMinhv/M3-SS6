package bt.bt5;

import java.util.Scanner;

public class StudentManagement {
    Student[] arrStudents = new Student[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        StudentManagement studentManagement = new StudentManagement();
        do {
            System.out.println("1: View Student list");
            System.out.println("2: Add student");
            System.out.println("3: Edit student by id");
            System.out.println("4: Delete student by id");
            System.out.println("5: Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studentManagement.displayStudent();
                    break;
                case 2:
                    studentManagement.createStudent(sc);
                    break;
                case 3:
                    studentManagement.updateStudent(sc);
                    break;
                case 4:
                    studentManagement.deleteStudent(sc);
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Please select 1 to 5");
                    ;
            }
        } while (true);
    }

    public void displayStudent() {
        System.out.println("Student information");
        for (int i = 0; i < currentIndex; i++) {
            arrStudents[i].display();
        }
    }

    public void createStudent(Scanner sc) {
        // khởi tạo
        arrStudents[currentIndex] = new Student();
        //
        arrStudents[currentIndex].inputData(sc);
        currentIndex++;
    }
    /**
     * @param id
     * @return index student of arrStudents
     * author:QuangND
     * create: 2023/09/26
     */
    public int getIndexById(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (arrStudents[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void updateStudent(Scanner sc) {
        System.out.println("Enter Student id want Update");
        int id = Integer.parseInt(sc.nextLine());
        int indexUpdate = getIndexById(id);
        if (indexUpdate > 0) {
            // update information
            System.out.println("update Student name:");
            String name = sc.nextLine();
            if (!name.trim().isEmpty()) {
                arrStudents[indexUpdate].setName(name);
            }
            System.out.println("update Student age:");
            String age = sc.nextLine();
            if (!age.trim().isEmpty()) {
                arrStudents[indexUpdate].setAge(Integer.parseInt(age));
            }
            System.out.println("update Student sex:");
            String gender = sc.nextLine();
            if (!gender.trim().isEmpty()) {
                arrStudents[indexUpdate].setSex(Boolean.parseBoolean(gender));
            }
            System.out.println("update Student address:");
            String addr = sc.nextLine();
            if (!addr.trim().isEmpty()) {
                arrStudents[indexUpdate].setAddress(addr);
            }
            System.out.println("update Student phone:");
            String uphone = sc.nextLine();
            if (!uphone.trim().isEmpty()) {
                arrStudents[indexUpdate].setPhone(uphone);
            }
        } else {
            System.err.println("Student id not exist");
        }
    }

    public void deleteStudent(Scanner sc) {
        System.out.println("Enter id student want delete:");
        int id = Integer.parseInt(sc.nextLine());
        int indexDelete = getIndexById(id);
        if (indexDelete >= 0) {
            for (int i = indexDelete; i < currentIndex - 1; i++) {
                arrStudents[i] = arrStudents[i + 1];
            }
            arrStudents[currentIndex - 1] = null;
            currentIndex--;
        } else {
            System.err.println("Student id not exist");
        }
    }
}
