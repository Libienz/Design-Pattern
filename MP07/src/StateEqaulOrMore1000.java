public class StateEqaulOrMore1000 implements State{
    private MainWindow japangi;

    public StateEqaulOrMore1000(MainWindow japangi) {
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
        String msg = "음료를 내보냅니다. 배출구를 확인하세요.";
        japangi.setBalance(japangi.getBalance() - 1000);
        if (japangi.getBalance() > 0) {
            msg = "거스름돈 " + japangi.getBalance() + "원을 반환합니다.";
            japangi.setBalance(0);

        }
        japangi.setMsgText(msg);
        japangi.setBalanceText();
        japangi.setState(japangi.getState_0());

    }

    @Override
    public void addHundread() {
        japangi.setBalance(japangi.getBalance() + 100);
        japangi.setBalanceText();
        japangi.setMsgText("");

    }

    @Override
    public void addFiveHundread() {
        japangi.setBalance(japangi.getBalance() + 500);
        japangi.setBalanceText();
        japangi.setMsgText("");
    }

    @Override
    public void addThousand() {
        japangi.setBalance(japangi.getBalance() + 1000);
        japangi.setBalanceText();
        japangi.setMsgText("이미 충분한 돈이 투입되었습니다. 음료를 선택하세요");
    }
}
