package com.company;

import java.util.Scanner;

public class SimpleCannibal extends Cannibal {
    private String day;  //определяем день недели
    public void cook() {
        Scanner in = new Scanner(System.in);
        System.out.println("А какой сегодня день недели:  ");
        this.day = in.nextLine();
        if (weekend(day)) {
            System.out.println("Готовим с огоньком");
            callFriends();
        } else {
            System.out.println("Суп и суп");
        }
    }

    public boolean weekend(String dayWeek) {
        if (!(dayWeek.equalsIgnoreCase("Saturday") || dayWeek.equalsIgnoreCase("Sunday"))) {
            return false;
        }
        return true;
    }

    public void callFriends(){
        System.out.println("Зову друзей! Друзья хотят покушать, пойдем гулять в лес");
    }
}
