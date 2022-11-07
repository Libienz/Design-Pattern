import java.util.List;

//지금 부터는 passwordinfo 뿐만 아니라 일반화 시킨 여러 오브젝트가 들어올 수 있도록 refactoring 할 것
//상속이 주 키워드임!


public class Main {

    public static void main(String[] args) {

        PasswordDAO myDAO = new ConcreteDAO();
        PasswordInfo user1 = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        PasswordInfo user2 = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");

        myDAO.insert(user1);
        myDAO.insert(user2);


        System.out.println("insert done");


        //모든 데이터가 제대로 삽입 되었는지 확인 (SELECT)
        List<PasswordInfo> passwordInfos = myDAO.finaAll();
        for (PasswordInfo p : passwordInfos) {
            System.out.println(p);
        }



        //두번째 user2 수정
        user2.setId("modified ID");
        user2.setPassword("modified pw");
        myDAO.update(user2.getUrl(), user2);

        System.out.println("update done");

        //데이터가 제대로 수정 되었는가?
        passwordInfos = myDAO.finaAll();
        for (PasswordInfo p : passwordInfos) {
            System.out.println(p);
        }


        //user2 pk로 삭제
        myDAO.delete(user2.getUrl());

        System.out.println("delete done");
        //데이터가 제대로 삭제 되었는가?
        //모든 데이터가 제대로 삽입 되었는지 확인 (SELECT)
        passwordInfos = myDAO.finaAll();
        for (PasswordInfo p : passwordInfos) {
            System.out.println(p);
        }


    }
}
