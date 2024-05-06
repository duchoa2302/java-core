import java.util.Date;

public class Group {
    public int groupid;
    public String groupname;
    public int creatorid;
    public Date createDate;

    public void dinhdanhcuanhom() {
        System.out.println("grouid là: " + groupid);
        System.out.println("groupname là : " + groupname);
        System.out.println("ID của người tạo là : " + creatorid);
        System.out.println("ngày taọ group là: " + createDate);
    }
}