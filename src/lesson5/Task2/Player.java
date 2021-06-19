package lesson5.Task2;

import java.io.Serializable;

public class Player implements Serializable {
    private String nickname;
    private double rating;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
