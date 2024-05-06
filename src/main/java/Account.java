import java.util.Date;

public class Account {
    public int AccounID;
    public String Email;
    public String userName;
    public String FullName;
    public Department DepartmentID;
    public Position PositionID;
    public Date CreateDate;

    public void inRaThongTinAccount() {
        System.out.println("ID cua account nay la: " + AccounID);
        System.out.println("Email cua account nay la: " + Email);
        System.out.println("Username cua account nay la: " + userName);
        System.out.println("FullName cua account nay la: " + FullName);
        System.out.println("Department cua account nay la: " +DepartmentID);
        System.out.println("Position cua account nay la: " +PositionID);
        System.out.println("CreateDate cua account nay la: " +CreateDate);
    }


}
