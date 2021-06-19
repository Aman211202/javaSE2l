package lesson8.task1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(2002);
            int id =0;
            while (true){
                Socket socket = server.accept();
                id++;

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
