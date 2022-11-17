public class State_500 implements State{
    private MainWindow japangi;

    public State_500(MainWindow japangi) {
        this.japangi = japangi;
    }

    @Override
    public void returnChanges() {
        japangi.setMsgText("" + japangi.getBalance() + "원을 반환합니다");
        japangi.setBalance(0);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_0());
    }

    @Override
    public void SelectBevearge() {
        japangi.setMsgText("1000원 이상을 넣은 후에 눌러주세요");
    }

    @Override
    public void addHundread() {
        japangi.setBalance(japangi.getBalance() + 100);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_less_1000());
        japangi.setMsgText("");
    }

    @Override
    public void addFiveHundread() {
        japangi.setBalance(japangi.getBalance()+500);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_equal_or_more_1000());
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
