import javax.swing.*;

public class WeatherDisplay extends DisplayDecorator{
    JPanel panel;
    LabelPanel labelPanel;
    Display displayComponent;
    WeatherDisplay(Display display, int width, int height) {
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
        labelPanel.updateText("Weather: 온도:20도, 습도: 60");
    }
}
