package lesson5;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println(" PRESS [2] TO LIST STUDENTS");
            System.out.println(" PRESS [0] TO EXIT");
            int choise = in.nextInt();
            if (choise == 1) {


                System.out.println("Name: ");
                System.out.println("Surname: ");
                String name = in.next();
                String surname = in.next();

                System.out.println("PRESS [1] TO ADD SUBJECT ");
                System.out.println(" PRESS [0] TO GO TO MAIN MENU  ");
                int choise1 = in.nextInt();
                ArrayList<Subject> subjects = new ArrayList<Subject>();
                if (choise1 == 1) {
                    System.out.println("Name:");
                    System.out.println("Credits: ");
                    String name1 = in.next();
                    int credits = in.nextInt();
                    subjects.add(new Subject(name1, credits));
                    students.add(new Student(name, surname, subjects));
                } else if (choise1 == 0) {
                    break;
                }
                try {
                    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
                    students= (ArrayList) inputStream.readObject();
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (choise == 2) {

                try {

                    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
                    students = (ArrayList<Student>) inputStream.readObject();
                    System.out.println(students);
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }



    }
}



