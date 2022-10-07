import javax.swing.*;

public class TimeDisplay extends DisplayDecorator{
    Display displayComponent;
    JPanel panel;
    LabelPanel labelPanel;
    TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
        displayComponent = display;
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
        labelPanel.updateText("Date: " + java.time.LocalDateTime.now().toString());


    }
}
