package lesson5.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = null;

        while(true) {
            System.out.println( "PRESS 1 TO CREATE GAME");
            System.out.println( "PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println( "PRESS 3 TO PLAY GAME");
            System.out.println( "PRESS 0 TO EXIT");
            int choice = in.nextInt();
            if(choice == 1){
                System.out.println("Game name: ");
                System.out.println("IP address: ");
                System.out.println("PORT: ");
                String name = in.next();
                String ip = in.next();
                int port = in.nextInt();
                game = new Game(name,ip,port);
                saveGame(game);



            }
        }

    }

    public static void saveGame(Game game){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outputStream.writeObject(game);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addPlayers(Player player) {


    }
}
