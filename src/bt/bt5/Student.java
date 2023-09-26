package bt.bt5;

import java.util.Scanner;

public class Student {

    private int id, age;
    private String name, phone, address;
    private boolean sex;

    public Student() {
    }

    public Student(int id, int age, String name, String phone, String address, boolean sex) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
    }

    public void inputData(Scanner sc) {
        System.out.println("Student id:");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Student Name:");
        this.name = sc.nextLine();
        System.out.print("Student Age:");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Student Address:");
        this.address = sc.nextLine();
        System.out.print("Student Phone:");
        this.phone = sc.nextLine();
        System.out.println("Student Gender male/female");
        this.sex = Boolean.parseBoolean(sc.nextLine());
    }
    public  void  display () {
        System.out.printf("ID: %d - Name: %s - Age: %d\n",this.id,this.name,this.age);
        System.out.printf("Sex: %b - Address: %s - Phone: %s\n",this.sex,this.address,this.phone);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
