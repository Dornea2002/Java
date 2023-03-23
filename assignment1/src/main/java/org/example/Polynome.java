package org.example;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Polynome {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String X_LETTER = "X";
    private static final String EXP = "^";
    protected HashMap<Integer, Double> polynome = new HashMap<Integer, Double>();

    protected HashMap<Integer, Double> getPolynome() {
        return polynome;
    }

    public void setPolynome(HashMap<Integer, Double> polynome) {
        this.polynome = polynome;
    }

    public Polynome() {
    }

    public HashMap addObject(int Exponent, double coeficient) {
        this.polynome.put(Exponent, coeficient);
        return this.polynome;
    }

    public void clear() {
        this.polynome.clear();
    }

    public int maximMonome() {
        int maxim = Integer.MIN_VALUE;
        for (Integer key : polynome.keySet()) {
            if (key >= maxim && polynome.get(key) != 0) {
                maxim = key;
            }
        }
        return maxim;
    }

    public void copyPolynome(Polynome p1, Polynome p2) {
        for (Integer key : p2.getPolynome().keySet()) {
            p1.getPolynome().put(key, p2.getPolynome().get(key));
        }
    }

    public String display() {

        TreeMap<Integer, Double> p = new TreeMap<Integer, Double>(Collections.reverseOrder());

        p.putAll(polynome);
        NavigableMap<Integer, Double> q = p.descendingMap();

        String s = new String();
        for (Integer key : q.descendingKeySet()) {
            double coeficient = q.get(key);
            if (key == this.maximMonome()) {
                if (coeficient > 0) {
                    if (coeficient == 1) {
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    } else {
                        s = s + coeficient;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    }
                } else {
                    if (coeficient == -1) {
                        s = s + MINUS;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    } else {
                        s = s + coeficient;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    }
                }

            } else if (key == 0) {
                if (coeficient > 0) {
                    s = s + PLUS;
                    s = s + coeficient;
                } else {
                    s = s + coeficient;
                }
            } else if (key == 1) {
                if (coeficient > 0) {
                    if (coeficient == 1) {
                        s = s + PLUS;
                        s = s + X_LETTER;
                    } else {
                        s = s + PLUS;
                        s = s + coeficient;
                        s = s + X_LETTER;
                    }
                } else {
                    if (coeficient == -1) {
                        s = s + MINUS;
                        s = s + X_LETTER;
                    } else {
                        s = s + coeficient;
                        s = s + X_LETTER;
                    }
                }
            } else {
                if (coeficient > 0) {
                    if (coeficient == 1) {
                        s = s + PLUS;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    } else {
                        s = s + PLUS;
                        s = s + coeficient;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    }
                } else {
                    if (coeficient == -1) {
                        s = s + MINUS;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    } else {
                        s = s + coeficient;
                        s = s + X_LETTER;
                        s = s + EXP;
                        s = s + key;
                    }
                }
            }
        }
        return s;
    }


    @Override
    public String toString() {
        return "Polynome{" +
                "polynome=" + polynome +
                '}';
    }
}