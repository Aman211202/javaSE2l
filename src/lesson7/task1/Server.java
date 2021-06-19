package lesson7.task1;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("INSERT MESSAGE: ");
    try {
        ServerSocket server = new ServerSocket(2002);
        Socket socket = server.accept();

        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

        MessageData messageData = null;

        while((messageData = (MessageData) inputStream.readObject())!= null){
            System.out.println(messageData);
            MessageData data = null;

            outputStream.writeObject(data);

        }
    }catch (Exception e){
        e.printStackTrace();
    }

    }
}
