package model;

import java.util.Date;

public class Score {

    private String user;
    private String content;
    private int day = 0;
    private int score = 0;
    private float weight = 0;
    private Date date;

    public Score(String user, int day, int score, float weight, Date date) {
        this.user = user;
        this.day = day;
        this.score = score;
        this.weight = weight;
        this.date = date;
    }

    public Score(String user, String content,  Date date) {
        setUser(user);
        setDay(content);
        setWeight(content);
        setDate(date);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDay(String content) {
        this.day = Integer.parseInt(this.content.substring(7,10));
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(String content) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
