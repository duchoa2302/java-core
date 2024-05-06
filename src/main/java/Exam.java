import java.util.Date;

public class Exam {
    int examID;
    String code;
    String title;
    int categoryid;
    Date duration;
    int creatorID;
    Date createDate;

    public void dinhdanhdethi_exam(){
        System.out.println("examid là: "+examID);
        System.out.println("code là: " + code);
        System.out.println("title là: "+ title);
        System.out.println("categoryid là : "+ categoryid);
        System.out.println("duration là : "+ duration);
        System.out.println("creatorid là: "+ creatorID);
        System.out.println("createdate là : " + createDate);
    }
}
