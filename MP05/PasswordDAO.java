import java.util.List;


//요거 제너릭 인터페이스로 만들면 일반화 가능
//추가로 상속까지 이용하면 확실한 일반화로 넘어간다.
//달라지는 부분을 자식클래스로 위임하는 것도 중요한 핵심. 예로 어느 데이터에서는 키가 4개 어떤 것은 키가 5개 .. 이렇다면 abstract으로 구현해서
//자식한테 위임한다.
//이거 실제로 만들어보고 교수 코드도 보자

//근데 제너릭스로 해서 쭉쭉 넣으면 메소드를 특정할수가... 없는데?
//k.toString() 이런걸로 키를 쿼리에 넘겨줄수가 있다.
//근데 delete 할 때 D d.getkey 이라든지.... 이런것은 어떻게 해결 할까?
    //D라는 타입은 getkey라는 것을 가지고 이써야 함
    //getKey라는 것을 가지고 있는 인터페이스 아무거나 하나 만들고
    //D라는게 이걸 구현하도록 하면 됨 !!!





public interface PasswordDAO {


    public void insert(PasswordInfo passwordInfo);
    public List<PasswordInfo> finaAll();
    public PasswordInfo findByKey(String url);
    public void update(String url, PasswordInfo p);
    public void delete(String url);
    public void delete(PasswordInfo p);



}
