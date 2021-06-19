package lesson2.task2;

public class Book {
    int id;
    String name;
    String author;


    public Book() {
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }



    public String getData(){
        return "id: " +id + "name: " + name + " author: " + author;
    }

}