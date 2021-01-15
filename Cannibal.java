package com.company;

public abstract class Cannibal {
    final void life() {
        catchMan();
        tellStory();
        if (weekend()) {
            cook();
        }
        eat();
        sleep();
    }

    public void sleep() {
        System.out.println("Я сплю хррр");
    }

    public void catchMan() {
        System.out.println("Папався");
    }

    public void tellStory(){}

    boolean weekend() {
        return true;
    }

    public void eat() {
        System.out.println("Вкутна омоном");
    }

    abstract void cook();

}
