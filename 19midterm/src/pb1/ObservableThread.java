package pb1;

import java.time.LocalTime;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

//자바의 Observable과 observer를 사용한 것이 아닌 제가 만든 인터페이스를 사용한 것임을 알립니다
public class ObservableThread implements Runnable, Observable {
    private static final int SLEEPTIME = 1;
    private ArrayList<Observer> observers = new ArrayList<>();
    private DateTime timer = new DateTime();

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
    public void unRegisterObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(timer.getTime());
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
    public void run() {
        while (!stopRunning) {
            LocalTime time = LocalTime.now();
            notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
