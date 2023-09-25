package ra.imp;

import ra.entity.Books;

import java.util.Scanner;

public class BookImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books[] booksList = new Books[100];
        int count = 0;

        do {
            System.out.println("-----------------Menu---------------- \n" +
                    "1: Nhập thông tin sách\n" +
                    "2: Hiển thị thông tin sách\n" +
                    "3: Tính giá bán sách\n" +
                    "4: Kiểm tra tên sách\n" +
                    "5: Exit");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.printf("Amount of book enter(less than %d):", booksList.length - count);

                    int amount = Integer.parseInt(sc.nextLine());
                    if(count + amount < 100){

                    for (int i = 0; i <amount ; i++) {
                        System.out.printf("Book %d data:\n", i + 1 );
                        Books newBook = new Books();
                        newBook.inputData(sc);
                        newBook.calExportPrice(newBook.getImportPrice());
                        booksList[count+i] = newBook;
                    }
                    count += amount;
                    }else {
                        System.out.println("total book can't exceed 100");
                    }
                    break;
                case 2:
                    for (Books book: booksList
                         ) {
                        if (book != null){
                            book.displayData();
                        }else {
                            break;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    ;
                default:
                    System.out.println("Please Select 1 to 5.");
                    break;
            }
        } while (true);
    }
}
