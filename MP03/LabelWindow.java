import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//observer
//자바의 Observable과 observer를 사용한 것이 아닌 제가 만든 인터페이스를 사용한 것임을 알립니다
public class LabelWindow extends FrameWindow implements Observer {
    private JLabel label;

    public LabelWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void updateText(String msg) {
        label.setText(msg);
        label.validate();
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

    @Override
    public void update(Integer primeNum) {
        label.setText(primeNum.toString());
    }
}
