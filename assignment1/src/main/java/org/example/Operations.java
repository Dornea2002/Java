package org.example;

import java.util.HashMap;

public class Operations {
    protected Polynome result = new Polynome();
    ;

    public Polynome getResult() {
        return result;
    }

    public void setResult(Polynome result) {
        this.result = result;
    }

    public Operations() {
    }

    public Polynome add(Polynome polynome1, Polynome polynome2) {
        for (Integer key : polynome1.getPolynome().keySet()) {
            if (polynome1.getPolynome().get(key) != null && polynome2.getPolynome().get(key) != null) {
                if (polynome1.getPolynome().get(key) + polynome2.getPolynome().get(key) != 0) {
                    result.getPolynome().put(key, polynome1.getPolynome().get(key) + polynome2.getPolynome().get(key));
                }
            } else if (polynome1.getPolynome().get(key) != null && polynome2.getPolynome().get(key) == null) {
                result.getPolynome().put(key, polynome1.getPolynome().get(key));
            }
        }
        for (Integer key : polynome2.getPolynome().keySet()) {
            if (polynome2.getPolynome().get(key) != null && polynome1.getPolynome().get(key) == null) {
                result.getPolynome().put(key, polynome2.getPolynome().get(key));
            }
        }
        return result;
    }

    public Polynome substract(Polynome polynome1, Polynome polynome2) {
        for (Integer key : polynome1.getPolynome().keySet()) {
            if (polynome1.getPolynome().get(key) != null && polynome2.getPolynome().get(key) != null) {
                if (polynome1.getPolynome().get(key) - polynome2.getPolynome().get(key) != 0) {
                    result.getPolynome().put(key, polynome1.getPolynome().get(key) - polynome2.getPolynome().get(key));
                }
            } else if (polynome1.getPolynome().get(key) != null && polynome2.getPolynome().get(key) == null) {
                result.getPolynome().put(key, polynome1.getPolynome().get(key));
            }
        }
        for (Integer key : polynome2.getPolynome().keySet()) {
            if (polynome2.getPolynome().get(key) != null && polynome1.getPolynome().get(key) == null) {
                result.getPolynome().put(key, -polynome2.getPolynome().get(key));
            }
        }
        return result;
    }

    public Polynome multiply(Polynome polynome1, Polynome polynome2) {

        for (Integer key1 : polynome1.getPolynome().keySet()) {
            for (Integer key2 : polynome2.getPolynome().keySet()) {
                if (result.getPolynome().get(key1 + key2) != null)
                    result.getPolynome().put((key1 + key2), (result.getPolynome().get(key1 + key2) + (polynome1.getPolynome().get(key1) * polynome2.getPolynome().get(key2))));
                else
                    result.getPolynome().put((key1 + key2), (polynome1.getPolynome().get(key1) * polynome2.getPolynome().get(key2)));
            }
        }
        return result;
    }

    public Polynome division(Polynome polynome1, Polynome polynome2) {
        int k1 = polynome1.maximMonome();
        int k2 = polynome2.maximMonome();

        while (k1 >= k2) {
            Polynome aux = new Polynome();
            Operations ans = new Operations();
            Operations ans2 = new Operations();

            aux.getPolynome().put((k1 - k2), (polynome1.getPolynome().get(k1) / polynome2.getPolynome().get(k2)));
            result.getPolynome().put((k1 - k2), (polynome1.getPolynome().get(k1) / polynome2.getPolynome().get(k2)));

            ans.multiply(aux, polynome2);
            ans2.substract(polynome1, ans.getResult());
            polynome1 = ans2.getResult();

            k1 = polynome1.maximMonome();
            k2 = polynome2.maximMonome();
        }
        return result;
    }

    public Polynome derive(Polynome polynome1) {
        for (Integer key : polynome1.getPolynome().keySet()) {
            if (key >= 1)
                result.getPolynome().put(key - 1, key * polynome1.getPolynome().get(key));
            else result.getPolynome().put(0, 0.0);
        }
        return result;
    }

    public Polynome integer(Polynome polynome1) {
        result.clear();
        for (Integer key : polynome1.getPolynome().keySet()) {
            double x = key + 1;
            int exponent = key + 1;
            double coefficient = polynome1.getPolynome().get(key) / x;
            result.getPolynome().put(exponent, coefficient);
        }
        return result;
    }
}

