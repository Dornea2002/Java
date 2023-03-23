package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {

        Frame frame = new Frame();

        System.out.println("Polynome1:");
        Polynome polinom1 = new Polynome();
        polinom1.addObject(3, 1);
        polinom1.addObject(2, -2);
        polinom1.addObject(1, 6);
        polinom1.addObject(0, -5);

        String s = polinom1.display();
        System.out.println(s);
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Polynome2:");
        Polynome polinom2 = new Polynome();
        polinom2.addObject(2, 1);
        polinom2.addObject(0, -1);

        String s1 = polinom2.display();
        System.out.println(s1);
        System.out.println("-------------------------------------------------------------------");


        Operations result = new Operations();


        System.out.println("Add:");
        result.add(polinom1, polinom2);

        s = result.getResult().display();
        System.out.println(s);

        result.getResult().clear();
        System.out.println("-------------------------------------------------------------------");


        System.out.println("Substract:");
        result.substract(polinom1, polinom2);
        s = result.getResult().display();
        System.out.println(s);
        result.getResult().clear();
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Multiply:");
        result.multiply(polinom1, polinom2);

        s = result.getResult().display();
        System.out.println(s);

        result.getResult().clear();
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Division:");
        result.division(polinom1, polinom2);
        s = result.getResult().display();
        System.out.println(s);
        result.getResult().clear();
        System.out.println("-------------------------------------------------------------------");


        System.out.println("Derive:");
        result.derive(polinom1);
        s = result.getResult().display();
        System.out.println(s);
        result.getResult().clear();
        System.out.println("-------------------------------------------------------------------");

        System.out.println("Integer:");
        result.integer(polinom2);
        s = result.getResult().display();
        System.out.println(s);
        result.getResult().clear();
    }
}
