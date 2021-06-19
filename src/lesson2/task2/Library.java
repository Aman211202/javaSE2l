package lesson2.task2;

import com.sun.jdi.request.ExceptionRequest;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Library {
    String name;
    String city;
    Book []books = new Book[20];
    int index = 0;

    public Library(String name, String city, Book[] books, int index) {
        this.name = name;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book){
       try{
            books[index] = book;
            index++;
       }catch (NullPointerException e){
           System.out.println("Null came");
       }
    }

    public void printBook(){
        for(int i =0; i < index;i++){
            if(books[i] == null){
                System.out.println("The book is empty");
            }
            else {
                System.out.println(books[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", books=" + Arrays.toString(books) +
                ", index=" + index +
                '}';
    }
}
