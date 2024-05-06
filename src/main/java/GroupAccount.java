import java.util.Date;

public class GroupAccount {
    int groupid;
    int accountID;
    Date joinDate;


    public void dinhdanhcuaaccount() {
        System.out.println("id dinh danh cua groupaccount là :" + groupid);
        System.out.println("id dinh danh cua account là :" + accountID);
        System.out.println("ngay tao  là :" + joinDate);
    }


}
