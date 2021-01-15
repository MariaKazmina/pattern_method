package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Первый людоед считает, что беседовать только время терять");
        System.out.println("    ");
        SimpleCannibal simpleCannibal = new SimpleCannibal();
        simpleCannibal.life();
        System.out.println("    ");
        System.out.println("Второй людоед и поговорить может, и готовит неплохо");
        System.out.println("    ");
        PhilosopherCannibal philosopherCannibal = new PhilosopherCannibal();
        philosopherCannibal.life();
    }
}
