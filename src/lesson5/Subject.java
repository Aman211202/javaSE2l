package lesson5;

import java.io.Serializable;

public class Subject implements Serializable {
    private String name;
    private int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }

}
