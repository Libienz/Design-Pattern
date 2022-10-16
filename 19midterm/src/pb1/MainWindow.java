package pb1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainWindow extends FrameWindow implements ActionListener {
    private static final String MAIN_TITLE = "pb2.Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String TEXTFIELD_OBSERVER_REMOVE_BUTTON_TITLE = "Remove TextField Window pb1.Observer";
    private static final String TEXTFIELD_OBSERVER_ADD_BUTTON_TITLE = "Add TextField Window pb1.Observer";
    private static final String LABELFIELD_OBSERVER_REMOVE_BUTTON_TITLE = "Remove Label Window pb1.Observer";
    private static final String LABELFIELD_OBSERVER_ADD_BUTTON_TITLE = "Add TextField Window pb1.Observer";

    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;
    private static final int NUM_BUTTONS = 3;

    private boolean isTextFieldRemoveTurn = true;
    private boolean isLabelFieldRemoveTurn = true;
    private JButton stopButton;
    private JButton removeTextFieldObserverButton;
    private JButton removeLabelFieldObserverButton;
    //private JButton addTextFieldObserverButton;
    //private JButton addLabelFieldObserverButton;

    private ObservableThread primeThread;
    private TextFieldWindow textFieldWindow;
    private LabelWindow labelWindow;

    public MainWindow(String title) {
        super(title, X, Y, WIDTH, HEIGHT);
        textFieldWindow = new TextFieldWindow(TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = new LabelWindow(LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });

        primeThread = new ObservableThread(); // 객체 생성
        primeThread.registerObserver(textFieldWindow); // 질문! -> 근데 이렇게 쓰면 .. 계속 추가될 때 마다 여기 코드를 고쳐야 하는데 .. 문제 없나 ..?
        primeThread.registerObserver(labelWindow);

        primeThread.run();  // 소수 생성 시작. 이 함수가 실행된 후에는 stopButton이 눌리기 전까지 무한 반복됨
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
        removeTextFieldObserverButton = createButton(TEXTFIELD_OBSERVER_REMOVE_BUTTON_TITLE, this, width, height);
        panel.add(removeTextFieldObserverButton);
        removeLabelFieldObserverButton = createButton(LABELFIELD_OBSERVER_REMOVE_BUTTON_TITLE, this, width, height);
        panel.add(removeLabelFieldObserverButton);
        stopButton = createButton(STOP_THREAD_BUTTON_TITLE, this, width, height);
        panel.add(stopButton);
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == removeTextFieldObserverButton) {
            if (isTextFieldRemoveTurn) {
                primeThread.unRegisterObserver(textFieldWindow);
                removeTextFieldObserverButton.setText(TEXTFIELD_OBSERVER_ADD_BUTTON_TITLE);
                isTextFieldRemoveTurn = false; //질문 setText를 통해서 버튼 이름 바꾸고 뭐할 차례인지 분기로 다시한번 따지긴 하는데 버튼 늘어나면 골치아픈데 ..?
            }
            else {
                primeThread.registerObserver(textFieldWindow);
                removeTextFieldObserverButton.setText(TEXTFIELD_OBSERVER_REMOVE_BUTTON_TITLE);
                isTextFieldRemoveTurn = true;
            }

        }

        else if (e.getSource() == removeLabelFieldObserverButton) {
            if (isLabelFieldRemoveTurn) {
                primeThread.unRegisterObserver(labelWindow);
                removeLabelFieldObserverButton.setText(LABELFIELD_OBSERVER_ADD_BUTTON_TITLE);
                isLabelFieldRemoveTurn = false;

            }
            else {
                primeThread.registerObserver(labelWindow);
                removeLabelFieldObserverButton.setText(LABELFIELD_OBSERVER_REMOVE_BUTTON_TITLE);
                isLabelFieldRemoveTurn = true;
            }

        }
        else if (e.getSource() == stopButton) {
            primeThread.stopRunning();
        }

    }

    private JButton createButton(String text, ActionListener listener, int width, int height) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height / NUM_BUTTONS);
        button.setMaximumSize(buttonDimension);
        button.setMinimumSize(buttonDimension);
        button.setPreferredSize(buttonDimension);
        return button;
    }

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE);

    }
}
