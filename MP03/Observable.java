
//자바의 Observable과 observer를 사용한 것이 아닌 제가 만든 인터페이스를 사용한 것임을 알립니다
public interface Observable {
    public void registerObserver(Observer ob);

    public void removeObserver(Observer observer);
    public void notifyObservers();
}
