import javax.swing.*;

public class SubtractCommandButton extends JButton implements Command {
    Calculator calculator;
    JLabel display;

    public SubtractCommandButton(Calculator calculator, JLabel display) {
        this.calculator = calculator;
        this.display = display;
    }

    @Override
    public void execute() {
        if (calculator.isOperand1Set()) {  // 첫 번째 피연산자 값이 지정되어야만 연산자 처리 가능
            calculator.setOperatorSet(true);
            calculator.setOperator(this.getText().charAt(0));
        }
    }
}
