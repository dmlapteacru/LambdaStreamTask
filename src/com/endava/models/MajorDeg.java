package com.endava.models;

public class MajorDeg {
    String name;
    double score;

    public MajorDeg() {
    }

    public MajorDeg(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "MajorDeg{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
