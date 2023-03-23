package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    //Declarations

    protected JLabel titlu;
    protected JButton polinomButton1;
    protected JButton polinomButton2;
    protected JLabel rezultatLabel;

    protected JTextField textPolinom1;
    protected JTextField textPolinom2;
    protected JTextField textRezultat;

    protected JButton unuButton;
    protected JButton doiButton;
    protected JButton treiButton;
    protected JButton patruButton;
    protected JButton cinciButton;
    protected JButton saseButton;
    protected JButton sapteButton;
    protected JButton optButton;
    protected JButton nouaButton;
    protected JButton zeroButton;
    protected JButton punctButton;
    protected JButton egalButton;
    protected JButton plusButton;
    protected JButton minusButton;
    protected JButton exponentButton;
    protected JButton addButton;
    protected JButton substractButton;
    protected JButton multiplyButton;
    protected JButton divideButton;
    protected JButton deriveButton;
    protected JButton integrateButton;
    protected JButton deleteButton;
    protected JButton xButton;
    protected JButton clearButton;


    protected String stringPolinom1 = new String();
    protected String stringPolinom2 = new String();
    protected String stringRezultat = new String();
    protected boolean setOnPolinom1 = false;
    protected boolean setOnPolinom2 = false;

    protected Convert convert = new Convert();

    protected Polynome p1 = new Polynome();
    protected Polynome p2 = new Polynome();
    protected Operations result = new Operations();

    public Frame() {

        //Positions

        Color c2 = new Color(96, 153, 102);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        Color c = new Color(157, 192, 139);
        getContentPane().setBackground(c);

        titlu = new JLabel();
        titlu.setText("Calculator polinomial");
        titlu.setFont(new Font("Arial", Font.BOLD, 16));
        titlu.setBounds(110, 10, 170, 50);
        getContentPane().add(titlu);

        polinomButton1 = new JButton();
        polinomButton1.setText("P1");
        polinomButton1.setFont(new Font("Arial", Font.PLAIN, 14));
        polinomButton1.setBounds(30, 75, 70, 20);
        polinomButton1.setBackground(c2);
        polinomButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOnPolinom1 = true;
                setOnPolinom2 = false;
            }
        });
        getContentPane().add(polinomButton1);

        polinomButton2 = new JButton();
        polinomButton2.setText("P2");
        polinomButton2.setFont(new Font("Arial", Font.PLAIN, 14));
        polinomButton2.setBounds(30, 105, 70, 20);
        polinomButton2.setBackground(c2);
        polinomButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOnPolinom1 = false;
                setOnPolinom2 = true;
            }
        });
        getContentPane().add(polinomButton2);

        rezultatLabel = new JLabel();
        rezultatLabel.setText("Rezultat:");
        rezultatLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        rezultatLabel.setBounds(30, 120, 150, 50);
        getContentPane().add(rezultatLabel);

        Color c1 = new Color(237, 241, 214);

        textPolinom1 = new JTextField();
        textPolinom1.setBounds(120, 75, 175, 20);
        textPolinom1.setBackground(c1);
        getContentPane().add(textPolinom1);

        textPolinom2 = new JTextField();
        textPolinom2.setBounds(120, 105, 175, 20);
        textPolinom2.setBackground(c1);
        getContentPane().add(textPolinom2);

        textRezultat = new JTextField();
        textRezultat.setBounds(120, 135, 175, 20);
        textRezultat.setBackground(c1);
        getContentPane().add(textRezultat);

        //SAPTE BUTTON

        sapteButton = new JButton();
        sapteButton.setBounds(30, 200, 70, 30);
        sapteButton.setText("7");
        sapteButton.setBackground(c2);
        getContentPane().add(sapteButton);

        sapteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "7";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "7";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //OPT BUTTON

        optButton = new JButton();
        optButton.setBounds(110, 200, 70, 30);
        optButton.setText("8");
        optButton.setBackground(c2);
        getContentPane().add(optButton);

        optButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "8";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "8";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //NOUA BUTTON

        nouaButton = new JButton();
        nouaButton.setBounds(190, 200, 70, 30);
        nouaButton.setText("9");
        nouaButton.setBackground(c2);
        getContentPane().add(nouaButton);
        nouaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "9";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "9";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //PLUS BUTTON

        plusButton = new JButton();
        plusButton.setBounds(270, 200, 70, 30);
        plusButton.setText("+");
        plusButton.setBackground(c2);
        getContentPane().add(plusButton);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "+";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "+";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //PATRU BUTTON

        patruButton = new JButton();
        patruButton.setBounds(30, 240, 70, 30);
        patruButton.setText("4");
        patruButton.setBackground(c2);
        getContentPane().add(patruButton);
        patruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "4";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "4";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //CINCI BUTTON

        cinciButton = new JButton();
        cinciButton.setBounds(110, 240, 70, 30);
        cinciButton.setText("5");
        cinciButton.setBackground(c2);
        getContentPane().add(cinciButton);
        cinciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "5";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "5";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //SASE BUTTON

        saseButton = new JButton();
        saseButton.setBounds(190, 240, 70, 30);
        saseButton.setText("6");
        saseButton.setBackground(c2);
        getContentPane().add(saseButton);
        saseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "6";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "6";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //MINUS BUTTON

        minusButton = new JButton();
        minusButton.setBounds(270, 240, 70, 30);
        minusButton.setText("-");
        minusButton.setBackground(c2);
        getContentPane().add(minusButton);
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "-";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "-";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //UNU BUTTON

        unuButton = new JButton();
        unuButton.setBounds(30, 280, 70, 30);
        unuButton.setText("1");
        unuButton.setBackground(c2);
        getContentPane().add(unuButton);
        unuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "1";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "1";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //DOI BUTTON

        doiButton = new JButton();
        doiButton.setBounds(110, 280, 70, 30);
        doiButton.setText("2");
        doiButton.setBackground(c2);
        getContentPane().add(doiButton);
        doiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "2";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "2";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //TREI BUTTON

        treiButton = new JButton();
        treiButton.setBounds(190, 280, 70, 30);
        treiButton.setText("3");
        treiButton.setBackground(c2);
        getContentPane().add(treiButton);
        treiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "3";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "3";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //EXPONENT BUTTON

        exponentButton = new JButton();
        exponentButton.setBounds(270, 280, 70, 30);
        exponentButton.setText("^");
        exponentButton.setBackground(c2);
        getContentPane().add(exponentButton);
        exponentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "^";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "^";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //PUNCT BUTTON

        punctButton = new JButton();
        punctButton.setBounds(30, 320, 70, 30);
        punctButton.setText(".");
        punctButton.setBackground(c2);
        getContentPane().add(punctButton);
        punctButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += ".";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += ".";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //ZERO BUTTON

        zeroButton = new JButton();
        zeroButton.setBounds(110, 320, 70, 30);
        zeroButton.setText("0");
        zeroButton.setBackground(c2);
        getContentPane().add(zeroButton);
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "0";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "0";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //EGAL BUTTON

        egalButton = new JButton();
        egalButton.setBounds(190, 320, 70, 30);
        egalButton.setText("=");
        egalButton.setBackground(c2);
        egalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.clear();
                p2.clear();
                String s = result.getResult().display();
                textRezultat.setText(s);
                System.out.println(s);
            }
        });
        getContentPane().add(egalButton);

        //DELETE BUTTON

        deleteButton = new JButton();
        deleteButton.setBounds(270, 320, 70, 30);
        deleteButton.setText("Delete");
        deleteButton.setBackground(c2);
        getContentPane().add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 = stringPolinom1.substring(0, stringPolinom1.length() - 1);
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 = stringPolinom2.substring(0, stringPolinom2.length() - 1);
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //X BUTTON

        xButton = new JButton();
        xButton.setBounds(100, 360, 70, 30);
        xButton.setText("X");
        xButton.setBackground(c2);
        getContentPane().add(xButton);
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (setOnPolinom1 && !setOnPolinom2) {
                    stringPolinom1 += "X";
                    textPolinom1.setText(stringPolinom1);
                }
                if (!setOnPolinom1 && setOnPolinom2) {
                    stringPolinom2 += "X";
                    textPolinom2.setText(stringPolinom2);
                }
            }
        });

        //CLEAR BUTTON

        clearButton = new JButton();
        clearButton.setBounds(200, 360, 70, 30);
        clearButton.setText("Clear");
        clearButton.setBackground(c2);
        getContentPane().add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.clear();
                p2.clear();
                result.getResult().clear();
                textRezultat.setText("");
                textPolinom1.setText("");
                textPolinom2.setText("");
                stringPolinom1 = "";
                stringPolinom2 = "";
                stringRezultat = "";
            }
        });

        //ADD BUTTON

        addButton = new JButton();
        addButton.setBounds(30, 400, 140, 30);
        addButton.setText("Add");
        addButton.setBackground(c2);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                String t2 = textPolinom2.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                convert.converter(t2, p2);
                result.add(p1, p2);
            }
        });
        getContentPane().add(addButton);

        //SUBSTRACT BUTTON

        substractButton = new JButton();
        substractButton.setBounds(200, 400, 140, 30);
        substractButton.setText("Substract");
        substractButton.setBackground(c2);
        substractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                String t2 = textPolinom2.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                convert.converter(t2, p2);
                result.substract(p1, p2);
            }
        });
        getContentPane().add(substractButton);

        //MULTIPLY BUTTON

        multiplyButton = new JButton();
        multiplyButton.setBounds(30, 440, 140, 30);
        multiplyButton.setText("Multiply");
        multiplyButton.setBackground(c2);
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                String t2 = textPolinom2.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                convert.converter(t2, p2);
                result.multiply(p1, p2);
            }
        });
        getContentPane().add(multiplyButton);

        //DIVIDE BUTTON

        divideButton = new JButton();
        divideButton.setBounds(200, 440, 140, 30);
        divideButton.setText("Divide");
        divideButton.setBackground(c2);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                String t2 = textPolinom2.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                convert.converter(t2, p2);
                result.division(p1, p2);
            }
        });
        getContentPane().add(divideButton);

        //DERIVE BUTTON

        deriveButton = new JButton();
        deriveButton.setBounds(30, 480, 140, 30);
        deriveButton.setText("Derive");
        deriveButton.setBackground(c2);
        deriveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                result.derive(p1);
            }
        });
        getContentPane().add(deriveButton);

        //INTEGER BUTTON

        integrateButton = new JButton();
        integrateButton.setBounds(200, 480, 140, 30);
        integrateButton.setText("Integrate");
        integrateButton.setBackground(c2);
        integrateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = textPolinom1.getText();
                p1.clear();
                p2.clear();
                result.getResult().clear();
                convert.converter(t1, p1);
                result.integer(p1);

            }
        });
        getContentPane().add(integrateButton);

        this.setSize(400, 600);
        this.setVisible(true);
    }
}
