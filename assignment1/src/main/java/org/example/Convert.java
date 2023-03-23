package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Convert {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String X_LETTER = "X";
    private static final String EXP = "^";

    public Convert() {
    }

    public Polynome converter(String s, Polynome p) {
//        Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
        Pattern pattern = Pattern.compile("[+-]?[0-9]+\\*x\\^[0-9]+|[+-]?x\\^[0-9]+|[+-]?[0-9]+x\\^[0-9]+|[+-]?[0-9]+\\*x|[+-]?[0-9]+x|[+-]?[0-9]+|[+-]?x");
        Matcher matcher = pattern.matcher(s);
        int x = 0;
        while (matcher.find()) {
            String monome = matcher.group(1);
            p = createPolynome(monome, p);
        }
        String string = p.display();
        System.out.println(string);
        return p;
    }

    public Polynome createPolynome(String monome, Polynome p) {
        int exponent = 0;
        double coeficient = 0.0;
        if (monome.contains(X_LETTER + EXP)) {
            String[] parts = monome.split("X\\^");
            exponent = Integer.parseInt(parts[1]);
            if (parts[0].equals("")) {
                coeficient = 1.0;
            } else if (parts[0].equals(MINUS)) {
                coeficient = -1.0;
            } else if (parts[0].equals(PLUS)) {
                coeficient = 1.0;
            } else coeficient = Double.parseDouble(parts[0]);
        } else if (monome.contains(X_LETTER)) {
            String[] parts = monome.split(X_LETTER);
            exponent = 1;
            if (parts[0].equals("")) {
                coeficient = 1.0;
            } else if (parts[0].equals(MINUS)) {
                coeficient = -1.0;
            } else if (parts[0].equals(PLUS)) {
                coeficient = 1.0;
            } else coeficient = Double.parseDouble(parts[0]);
        } else {
            coeficient = Double.parseDouble(monome);
        }
        if (coeficient != 0) {
            p.getPolynome().put(exponent, coeficient);
            return p;
        } else return null;
    }
}

