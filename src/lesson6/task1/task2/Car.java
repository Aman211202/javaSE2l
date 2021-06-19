package lesson6.task1.task2;

public class Car extends Thread{
    private String name;
    private double speed;
    private int distance;

    public Car(String name,  double speed, int distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public Car(ThreadGroup group, String name, String name1, double speed, int distance) {
        super(group, name);
        this.name = name1;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {
        try{
            for(int i =0; i < distance/speed; i++){
                Thread.sleep(1000);
                System.out.println(name + "is on: " + i * speed);
            }
            System.out.println(name + "has finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}