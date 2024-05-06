import javax.xml.crypto.Data;
import java.util.Date;

public class Question {
    int questionID;
    String content;
    int categoryID;
    int typeID;
    int creatorID;
    Date createDate;

    public void dinhdanhcauhoi() {
        System.out.println("questionID của câu hỏi: " +questionID);
        System.out.println("câu hỏi content là: " + content);
        System.out.println("định danh của categoryID là: " + categoryID);
        System.out.println("định danh của typeid là : " + typeID);
        System.out.println("id của creatorid là: " + creatorID);
        System.out.println("ngày tạo câu hỏi là :  " +createDate);
    }



}
