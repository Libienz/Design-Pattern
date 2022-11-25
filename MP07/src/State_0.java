public class State_0 implements State{

    private MainWindow japangi;
    public State_0(MainWindow japangi) {
        this.japangi = japangi;
    }

    @Override
    public void returnChanges() {
        //암것도 안함
    }

    @Override
    public void SelectBevearge() {
        japangi.setMsgText("돈을 넣은 후에 눌러주세요");
    }

    //보면 모든 오버라이드된 메소드에서 비슷한 형태 반복 .. 부모로 빼면 깔끔할 수 있다고 교수님께서 말씀
    //템플릿과 엮어서 해결할 수도 있을 듯 문제 나올지도??
    @Override
    public void addHundread() {
        japangi.setBalance(japangi.getBalance()+100);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_less_500());
        japangi.setMsgText("");

    }

    @Override
    public void addFiveHundread() {
        japangi.setBalance(japangi.getBalance()+500);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_500());
        japangi.setMsgText("");
    }

    @Override
    public void addThousand() {
        japangi.setBalance(japangi.getBalance()+1000);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_equal_or_more_1000());
        japangi.setMsgText("");

    }
}
