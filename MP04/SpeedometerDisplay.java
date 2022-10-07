import javax.swing.*;
import java.awt.*;

public class SpeedometerDisplay extends DisplayDecorator{

    Display displayComponent;
    JPanel panel;
    LabelPanel labelPanel;

    SpeedometerDisplay(Display display, int width, int height) {
        super(display,width, height);
        this.displayComponent = display;

    }

    @Override
    public JPanel create() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(displayComponent.create());
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;

    }

    @Override
    public void show() {
        displayComponent.show();
        labelPanel.updateText("Speed: 50");
    }
}
