package lesson7.task1;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.logging.SocketHandler;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INSERT YOUR NAME: ");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1",2002);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println("Insert message: ");
                String message = in.next();
                Date date = new Date();
                MessageData messageData = new MessageData(name,message,date);
                outputStream.writeObject(messageData);
                if((messageData = (MessageData)inputStream.readObject())!=null){
                    System.out.println(messageData.getMessageText());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
