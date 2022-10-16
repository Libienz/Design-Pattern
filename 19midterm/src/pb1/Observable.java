package pb1;

public interface Observable {

    public void registerObserver(Observer ovs);
    public void unRegisterObserver(Observer ovs);
    public void notifyObservers();

}
