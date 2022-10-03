import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//자바의 Observable과 observer를 사용한 것이 아닌 제가 만든 인터페이스를 사용한 것임을 알립니다
public class PrimeObservableThread implements Runnable, Observable {
    private static final int SLEEPTIME = 500;
    private ArrayList<Observer> observers = new ArrayList<>();

    private int primeNumber;
    private int numCount = 1;
    private boolean stopRunning = false;

    public int getPrimeNumber() { return primeNumber; }

    public void stopRunning() { stopRunning = true; }

    public void startRunning() {
        stopRunning = false;
        run();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    private void generatePrimeNumber() {
        primeNumber = 2;
        notifyObservers();
        System.out.println(primeNumber);
        while (stopRunning == false) {
            numCount += 2; // 2를 제외한 짝수는 소수가 될 수 없음. 따라서 홀수만 검사
            if (isPrimeNumber(numCount)) {
                primeNumber = numCount;
                notifyObservers();

                System.out.println(primeNumber);
            }
            try {
                Thread.sleep(SLEEPTIME); // 1초 쉼
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() { generatePrimeNumber(); }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(primeNumber);
        }
    }
}
