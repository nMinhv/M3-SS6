package ra.entity;

import java.util.Scanner;

public class Books {
    /*
  Xây dựng lớp Book trong ra.entity gồm các thông tin sau:
        Thuộc tính
        bookId - int
        bookName - String
        importPrice - float
        exportPrice - float
        author - String
        status - boolean
        Các constructor: default - Khởi tạo tất cả thông tin sách
        Các phương thức getter/setter
        Các phương thức:
        inputData(Scanner scanner): nhập thông tin sách (trừ exportPrice)
        displayData(): hiển thị tất cả thông tin đối tượng
        calExportPrice(): tính exportPrice theo công thức:
        exportPrice = importPrice * 1.2
        Xây dựng lớp BookImp trong ra.impl thực hiện khởi tạo đối tượng Book và
        hiển thị menu và thực hiện các chức năng theo menu:
        **MENU**
        Nhập thông tin sách
        Hiển thị thông tin sách
        Tính giá bán sách
        Kiểm tra tên sách
        Thoát
*/
    private int bookId;
    private String bookTitle;
    private float importPrice;
    private float exportPrice;
    private String author;
    private boolean status;

    public Books() {
    }

    public Books(int bookId, String bookTitle, float importPrice, float exportPrice, String author, boolean status) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner sc) {
        System.out.println("Enter Book id:");
        this.bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Book title:");
        this.bookTitle = sc.nextLine();
        System.out.println("Enter Book import price:");
        this.importPrice = Float.parseFloat(sc.nextLine());
        System.out.println("Enter Book author:");
        this.author = sc.nextLine();
        System.out.println("Enter Book status:");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayData() {
        System.out.printf("Book id: %d - Title: %s - Author: %s \nImport Price: %f - Export Price: %f Status: %s \n", this.bookId, this.bookTitle, this.author, this.importPrice, this.exportPrice, this.status);
    }
    public float calExportPrice (float importPrice) {
        return this.exportPrice = (float) (importPrice * 1.2);
    }
}
