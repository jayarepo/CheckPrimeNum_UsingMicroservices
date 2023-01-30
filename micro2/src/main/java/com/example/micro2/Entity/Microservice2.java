package com.example.micro2.Entity;

public class Microservice2 {
    private int num;

    public Microservice2() {
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Microservice1{" +
                "num=" + num +
                '}';
    }

    public Microservice2(int num) {
        this.num = num;
    }
}
