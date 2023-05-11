package calculator;

import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.event.MouseInputAdapter;

public class EventButtonListener extends MouseInputAdapter {

    @Override
    public void mouseClicked(MouseEvent me) {
        JButton button = (JButton) me.getSource();
        String buttonText = button.getText();

        switch (buttonText) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" -> {
                if ("+-/*".contains(EventButton.getCurrentText())) {
                    EventButton.setCurrentText("");
                    EventButton.setTxt();
                    EventButton.setEqual(false);
                }
                if (EventButton.getEqual() == true) {
                    clear();
                }
                EventButton.setCurrentText(buttonText);
                EventButton.setTxt();
                EventButton.setResult(Integer.parseInt(EventButton.getCurrentText()));
            }
            case "C" -> {
                clear();
            }
            case "+", "-", "*", "/" -> {
                if ("+-/*".contains(EventButton.getCurrentText())) {
                    EventButton.setOperator(buttonText);
                    EventButton.setCurrentText(buttonText);
                    EventButton.setTxt();
                }
                EventButton.setResult2(EventButton.getResult(), EventButton.getOperator());
                EventButton.setCurrentText(buttonText);
                EventButton.setTxt();
                EventButton.setOperator(buttonText);
                EventButton.setResult(0);
            }
            case "=" -> {
                EventButton.setCurrentText("");
                EventButton.setTxt();
                EventButton.setResult2(EventButton.getResult(), EventButton.getOperator());
                EventButton.setCurrentText(String.valueOf(EventButton.getResult2()));
                EventButton.setTxt();
                EventButton.setOperator("");
                EventButton.setResult(0);
                EventButton.setEqual(true);
            }

        }
    }

    public void clear() {
        EventButton.setCurrentText("");
        EventButton.setTxt();
        EventButton.setOperator("+");
        EventButton.setResult(0);
        EventButton.setResult2(0);
        EventButton.setEqual(false);
    }

}
