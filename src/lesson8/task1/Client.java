package lesson8.task1;

import org.w3c.dom.ls.LSOutput;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Socket socket = new Socket("127.0.0.1",2002);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true){
                System.out.println("[1] TO LIST BOOKS");
                System.out.println("[2] ADD BOOKS");
                System.out.println("[0] EXIT");

                int choice = in.nextInt();
                if(choice == 1){

                }else if(choice == 2){
                    try {
                        System.out.println("Enter your id pls: ");
                        int id = in.nextInt();
                        System.out.println("Enter your name pls: ");
                        String name = in.next();
                        System.out.println("Enter author: ");
                        String author = in.next();
                        Book book = new Book();
                        book = new Book(id,name,author);
                        outputStream.writeObject(book);

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
