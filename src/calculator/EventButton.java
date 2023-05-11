package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventButton extends JFrame {

    JButton one, two, three, four, five, six, seven, eight, nine, zero, c, equals, add, substract, multiply, divide;
    
    private static String operator = "+";
    private static int result = 0;
    private static int result2 = 0;
 
    private static JTextField txt;
    private static String currentText = "";
    private static boolean equal = false;

    public static JTextField getTxt() {
        return txt;
    }

    public static void setTxt() {

        EventButton.txt.setText(EventButton.getCurrentText());

    }

    public static String getCurrentText() {
        return currentText;
    }

    public static void setCurrentText(String currentText) {
        if (currentText.isEmpty() || "+-*/".contains(currentText)) {
            EventButton.currentText = currentText;
        } else {
            EventButton.currentText += currentText;
        }
    }

    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        EventButton.result = result;
    }

    public static int getResult2() {
        return result2;
    }

    public static void setResult2(int result2) {

        EventButton.result2 = result2;

    }

    public static void setResult2(double result2, String oper) {
        switch (oper) {
            case "+" ->
                EventButton.result2 += result2;
            case "-" ->
                EventButton.result2 -= result2;
            case "*" ->
                EventButton.result2 *= result2;
            case "/" ->
                EventButton.result2 /= result2;
        }
    }

    public static String getOperator() {
        return operator;
    }

    public static void setOperator(String operator) {
        EventButton.operator = operator;
    }

    public static boolean getEqual() {
        return equal;
    }

    public static void setEqual(boolean equal) {
        EventButton.equal = equal;
    }

    
    
    public EventButton() {

        EventButtonListener e = new EventButtonListener();

        setTitle("Mi calculadora");
        setSize(375, 440);
        setLayout(null);
        setLocationRelativeTo(null);

        txt = new JTextField();
        txt.setEditable(false);
        txt.setBounds(20, 20, 335, 50);

        one = new JButton("1");
        one.setBounds(20, 85, 80, 80);
        two = new JButton("2");
        two.setBounds(105, 85, 80, 80);
        three = new JButton("3");
        three.setBounds(190, 85, 80, 80);
        four = new JButton("4");
        four.setBounds(20, 170, 80, 80);
        five = new JButton("5");
        five.setBounds(105, 170, 80, 80);
        six = new JButton("6");
        six.setBounds(190, 170, 80, 80);
        seven = new JButton("7");
        seven.setBounds(20, 255, 80, 80);
        eight = new JButton("8");
        eight.setBounds(105, 255, 80, 80);
        nine = new JButton("9");
        nine.setBounds(190, 255, 80, 80);
        zero = new JButton("0");
        zero.setBounds(105, 340, 80, 80);
        c = new JButton("C");
        c.setBounds(20, 340, 80, 80);
        equals = new JButton("=");
        equals.setBounds(190, 340, 80, 80);
        add = new JButton("+");
        add.setBounds(275, 85, 80, 80);
        substract = new JButton("-");
        substract.setBounds(275, 170, 80, 80);
        multiply = new JButton("*");
        multiply.setBounds(275, 255, 80, 80);
        divide = new JButton("/");
        divide.setBounds(275, 340, 80, 80);

        getContentPane().add(txt);
        
        getContentPane().add(one);
        getContentPane().add(two);
        getContentPane().add(three);
        getContentPane().add(four);
        getContentPane().add(five);
        getContentPane().add(six);
        getContentPane().add(seven);
        getContentPane().add(eight);
        getContentPane().add(nine);
        getContentPane().add(zero);
        getContentPane().add(c);
        getContentPane().add(equals);
        getContentPane().add(add);
        getContentPane().add(substract);
        getContentPane().add(multiply);
        getContentPane().add(divide);

        one.addMouseListener(e);
        two.addMouseListener(e);
        three.addMouseListener(e);
        four.addMouseListener(e);
        five.addMouseListener(e);
        six.addMouseListener(e);
        seven.addMouseListener(e);
        eight.addMouseListener(e);
        nine.addMouseListener(e);
        zero.addMouseListener(e);
        c.addMouseListener(e);
        add.addMouseListener(e);
        substract.addMouseListener(e);
        multiply.addMouseListener(e);
        divide.addMouseListener(e);
        equals.addMouseListener(e);

        setVisible(true);

    }

}
