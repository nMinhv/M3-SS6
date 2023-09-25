package ra.entity;

import java.util.Scanner;

public class Student {
    /*
    - Xây dựng lớp sinh viên:
    + 1. các đặc điểm: mã sv, tên, tuổi, giới tính, địa chỉ, trạng thái
    + 2. 3 constructors: default và khởi tạo thông tin sv
    + 3. phương thức getter setter
    + 4. xây dựng các hành vi:
        * greeting
        * tính tổng
        * nhập thông tin sv
        * hiển thị thông tin sv
     */
    //1. Attributes / Fields
    //- private datatype attributeName
    private String id;
    private String name;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;
    // 2. Constructors
    public Student() {
    }
    public Student (int age, boolean sex) {
        this.age = age;
        this.sex = sex;
    }

    // this.id: thuộc tính id của đối tượng đang làm việc
    public Student(String id, String name, int age, boolean sex, String address, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }
    // 3. Methods
    //3.1 - getter/setter
    //Get: lấy dữ liệu thuộc tính
    //Set: gán giá trị cho thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void greeting () {
        System.out.println("Hello there.");
    }
    public int sumTwoNum (int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
    public void inputData(Scanner scanner)  {
        System.out.println("Enter id:");
        this.id = scanner.nextLine();
        System.out.println("Enter Name:");
        this.name = scanner.nextLine();
        System.out.println("Enter Age:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Sex:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter Address:");
        this.address = scanner.nextLine();
        System.out.println("Enter Status:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
    public void displayData() {
        System.out.printf("id: %s - Name: %s - Age: %d \n",this.id,this.name,this.age);
        System.out.printf("Gender : %s - Address: %s - Status: %s \n", this.sex,this.address,this.status);
    }
}
