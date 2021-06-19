package lesson6.task1.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group");

        Car car = new Car(group,"thread","scac",140,1000);
        Car car2 = new Car(group,"thread","qwc",180,1000);
        Car car3 = new Car(group,"thread","dc",100,1000);
        Car car4 = new Car(group,"thread","ewd",190,1000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for(Car c: cars){
            c.start();
        }
        ArrayList<Car> sorted = new ArrayList<>();
        while(group.activeCount()>0){
            Car removing = null;
            for(Car c: cars){
                if(!c.isAlive()){
                    sorted.add(c);
                    c = removing;
                }
            }
            cars.remove(removing);
        }
        sorted.add(cars.get(0));
        for(int i = 0; i < sorted.size();i++){
            System.out.println(i + 1 + " has finished " + sorted.get(i).getName());
        }
    }
}