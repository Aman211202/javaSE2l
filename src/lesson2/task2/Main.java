package lesson2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        int cnt = 0;
        while (true){
            System.out.println("[1] add book");
            System.out.println("[2] print books");
            System.out.println("[0] exit");

            int choice = in.nextInt();

            if(choice == 1){
                Book book;
                try{
                    int id = in.nextInt();
                    String name = in.next();
                    String author = in.next();

                    book = new Book(id,name,author);
                }catch (Exception e){
                    book = null;
                    e.printStackTrace();
                }
                library.addBook(book);
                cnt++;
            }
            else if(choice == 2){
                library.printBook();
            }
            else {
                break;
            }
        }
    }
}
