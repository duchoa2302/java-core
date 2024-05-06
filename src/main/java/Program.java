import java.util.Date;

public class Program {
    public static void main(String[] args) {

        // bảng Department

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Bảo vệ";
        System.out.println("Tên phòng ban 1: " + department1.name);
        System.out.println("id của phòng ban 1 là: " + department1.id );

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Giám đốc";
        System.out.println("Tên phòng ban 2 là : " + department2.name);
        System.out.println("id của phòng ban 2 là: " + department2.id);

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "kĩ sư";
        System.out.println("Tên phòng ban 3: " + department3.name);
        System.out.println("id của phòng ban 3 là: " + department3.id);

    // bảng Position

        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Dev";
        System.out.println("id: " + position1.id);
        System.out.println("Chức vụ: " + position1.name);

        Position position2 = new Position();
        position2.id = 2;
        position2.name = "Test";
        System.out.println("id: " + position2.id);
        System.out.println("Chức vụ: " + position2.name);

        Position position3 = new Position();
        position3.id = 3;
        position3.name = "PM";
        System.out.println("id: " + position3.id);
        System.out.println("Chức vụ: " + position3.name);

        // bảng account

        Account account1 = new Account();
        account1.AccounID = 1;
        account1.Email = "conbocuoi@gmail.com";
        account1.userName = "anhhoa123";
        account1.FullName = "ho duc hoa";
        account1.DepartmentID = department1;
        account1.PositionID = position1;
        account1.CreateDate = new Date();
        System.out.println("Thong tin cua account" + account1.AccounID + " la:");
        account1.inRaThongTinAccount();

        Account account2 = new Account();
        account2.AccounID = 2;
        account2.Email = "hoducbao@gmail.com";
        account2.userName = "anhbao23";
        account2.FullName = "ho duc bao";
        account2.DepartmentID = department3;
        account2.PositionID = position3;
        System.out.println("Thong tin cua account" + account2.AccounID + " la:");
        account2.inRaThongTinAccount();


        Account account3 = new Account();
        account3.AccounID = 3;
        account3.Email = "nguyenvantuan@gmail.com";
        account3.userName = "tuan123";
        account3.FullName = "nguyen van tuan";
        account3.DepartmentID = department2;
        account3.PositionID = position2;
        System.out.println("Thong tin cua account" + account3.AccounID + " la:");
        account3.inRaThongTinAccount();


        // bảng group

        Group group1 = new Group();
        group1.groupid = 1;
        group1.groupname = "nhom1";
        group1.creatorid = 1;
        group1.createDate = new Date();
        System.out.println("thong tin cua group " + group1.groupid + "là: ");
        group1.dinhdanhcuanhom();

        Group group2 = new Group();
        group2.groupid = 2;
        group2.groupname = "nhom2";
        group2.creatorid = 2;
        group2.createDate = new Date();
        System.out.println("thong tin cua group " + group2.groupid + "là: ");
        group2.dinhdanhcuanhom();

        Group group3 = new Group();
        group3.groupid = 3;
        group3.groupname = "nhom3";
        group3.creatorid = 3;
        group3.createDate = new Date();
        System.out.println("thong tin cua group " + group3.groupid + "là: ");
        group3.dinhdanhcuanhom();


        // bảng groupaccount

        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupid = 1;
        groupAccount1.accountID = 1;
        groupAccount1.joinDate = new Date();
        System.out.println("thong tin cua groupAccount " + groupAccount1.groupid + "là: ");
        groupAccount1.dinhdanhcuaaccount();

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupid = 2;
        groupAccount2.accountID = 2;
        groupAccount2.joinDate = new Date();
        System.out.println("thong tin cua groupAccount " + groupAccount2.groupid + "là: ");
        groupAccount2.dinhdanhcuaaccount();


        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupid = 3;
        groupAccount3.accountID = 3;
        groupAccount3.joinDate = new Date();
        System.out.println("thong tin cua groupAccount " + groupAccount3.groupid + "là: ");
        groupAccount3.dinhdanhcuaaccount();


        // bảng typequestion

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeID = 1;
        typeQuestion1.typeName = "Essay";
        System.out.println("định danh của loại câu hỏi là : " + typeQuestion1.typeID);
        System.out.println("tên của loại câu hỏi là : " + typeQuestion1.typeName );

         // private static tại sao đã có typequestion nhưng vẫn phải taọ private static nếu ko sẽ có lõi

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeID = 2;
        typeQuestion2.typeName = "Multiple-Choice";
        System.out.println("định danh của loại câu hỏi là : " + typeQuestion2.typeID);
        System.out.println("tên của loại câu hỏi là : " + typeQuestion2.typeName );

        // bảng CategoryQuestion

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryID = 1;
        categoryQuestion1.categoryName = "Java";
        System.out.println("categoryid là: " + categoryQuestion1.categoryID);
        System.out.println("categoryName là: " + categoryQuestion1.categoryName);

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryID = 2;
        categoryQuestion2.categoryName = "NET";
        System.out.println("categoryid là: " + categoryQuestion2.categoryID);
        System.out.println("categoryName là: " + categoryQuestion2.categoryName);


        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryID = 3;
        categoryQuestion3.categoryName = "SQL";
        System.out.println("categoryid là: " + categoryQuestion3.categoryID);
        System.out.println("categoryName là: " + categoryQuestion3.categoryName);

        // Question

        Question question1 = new Question();
        question1.questionID = 1;
        question1.content = "conten1";
        question1.categoryID = 1;
        question1.typeID = 1;
        question1.creatorID = 1;
        question1.createDate = new Date();
        System.out.println("dinh danh cua cau hoi" + question1.questionID + "la");
        question1.dinhdanhcauhoi();

        Question question2 = new Question();
        question2.questionID = 2;
        question2.content = "conten2";
        question2.categoryID = 2;
        question2.typeID = 2;
        question2.creatorID = 2;
        question2.createDate = new Date();
        System.out.println("dinh danh cua cau hoi" + question2.questionID + "la");
        question2.dinhdanhcauhoi();

        Question question3 = new Question();
        question3.questionID = 3;
        question3.content = "conten3";
        question3.categoryID = 3;
        question3.typeID = 3;
        question3.creatorID = 3;
        question3.createDate = new Date();
        System.out.println("dinh danh cua cau hoi" + question3.questionID + "la");
        question3.dinhdanhcauhoi();

        // bảng Answer

        Answer answer1 = new Answer();
        answer1.answerID = 1;
        answer1.content = "tromcho";
        answer1.questionID = 1;
        answer1.isCorrect = true;
        System.out.println("dinh danh cua cau tra loi la: "+ answer1.answerID + "la");
        answer1.Answer_1();

        Answer answer2 = new Answer();
        answer2.answerID = 2;
        answer2.content = "tromMeo";
        answer2.questionID = 2;
        answer2.isCorrect = false;
        System.out.println("dinh danh cua cau tra loi la: "+ answer2.answerID + "la");
        answer2.Answer_1();

        Answer answer3 = new Answer();
        answer3.answerID = 3;
        answer3.content = "tromChim";
        answer3.questionID = 3;
        answer3.isCorrect = true;
        System.out.println("dinh danh cua cau tra loi la: "+ answer3.answerID + "la");
        answer3.Answer_1();


       // bang Exam

        Exam exam1 = new Exam();
        exam1.examID = 1;
        exam1.code = "msi1";
        exam1.title = "trom nhanh nhat";
        exam1.categoryid = 1;
        exam1.duration = new Date();
        exam1.creatorID = 1;
        exam1.createDate = new Date();
        System.out.println("định danh của examid là:  " +exam1.examID + "là");
        exam1.dinhdanhdethi_exam();

        Exam exam2 = new Exam();
        exam2.examID = 2;
        exam2.code = "msi2";
        exam2.title = "trom nhieu nhat";
        exam2.categoryid = 2;
        exam2.duration = new Date();
        exam2.creatorID = 2;
        exam2.createDate = new Date();
        System.out.println("định danh của examid là:  " +exam2.examID + "là");
        exam2.dinhdanhdethi_exam();

        Exam exam3 = new Exam();
        exam3.examID = 3;
        exam3.code = "msi3";
        exam3.title = "trom nhiều cân  nhat";
        exam3.categoryid = 3;
        exam3.duration = new Date();
        exam3.creatorID = 3;
        exam3.createDate = new Date();
        System.out.println("định danh của examid là:  " +exam3.examID + "là");
        exam3.dinhdanhdethi_exam();

        // Bảng ExamQuestion

        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examID = 1;
        examQuestion1.questionId = "trộm";
        System.out.println("examid là:  "+ examQuestion1.examID);
        System.out.println("questionId là:  "+ examQuestion1.questionId);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examID = 2;
        examQuestion2.questionId = "cướp";
        System.out.println("examid là:  "+ examQuestion2.examID);
        System.out.println("questionId là:  "+ examQuestion2.questionId);

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examID = 3;
        examQuestion3.questionId = "ăn cắp";
        System.out.println("examid là:  "+ examQuestion3.examID);
        System.out.println("questionId là:  "+ examQuestion3.questionId);
    }
}

