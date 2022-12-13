import java.util.List;


//jdbc : java database connectivity
//여러 데이터베이스를 동일한 api로 핸들링 하도록 도와줌
//다오는 그위에 내입맛대로 crud알고리즘을 바꾸겠다고 이야기 한 것!
//인터페이스를 구현하고 해당 인터페이스를 implement하면 끝이다.
//이로써 서비스 로직과 DB를 이용하는 부분을 완전히 분리 가능
//클라이언트의 변화에 둔감한 디자인 패턴! OCP 굳

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
