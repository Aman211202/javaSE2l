package lesson4;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        ArrayList<String> products = readText();
//
//        while(true) {
//            System.out.println("[1] add products");
//            System.out.println("[2] read products");
//            System.out.println("[3] exit");
//            int choise = in.nextInt();
//            if (choise == 1) {
//                String tex1t = in.next();
//                products.add(tex1t);
//                writeText(products);
//            }
//            else if(choise == 2){
//                System.out.println(readText());
//            }
//            else if(choise == 3){
//                break;
//            }
//        }
//    }
//
//    public static void writeText(ArrayList<String> products){
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
//            for(String s : products){
//                writer.write(s);
//            }
//            writer.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }
//
//    public static ArrayList<String> readText(){
//        ArrayList<String> returnedProducts = new ArrayList<>();
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
//            String s;
//            while((s = reader.readLine()) != null){
//                returnedProducts.add(s);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return returnedProducts;
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


    }

}

