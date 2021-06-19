package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User []users = new User[5];
            int count = 0;
            int sum = 0;
        for(int i = 0; i < users.length; i++){
            String name = in.next();
            String surname= in.next();
            int age;
           try{
               age = in.nextInt();
           count++;
           }
           catch (Exception e){
               age = 0;
               e.printStackTrace();
               System.out.println("You wrote");
           }
            sum+=age;
            users[i] = new User(name,surname,age);

            System.out.println(sum/count);
        }



    }
}
