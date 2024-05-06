public class SwitchCaseDemo {
    public static void main(String[] args) {
        // sử dụng khi nhiều nhánh khoảng 3 4 đổ lên
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("có 31 ngày");
                break;
            case 2:
                System.out.println("có 28 hoặc 29");
                break;
                // break dùng để tách ra các nhánh
            default:

                System.out.println("lên google mà hỏi");
                break;

        }
        // cách vận dụng break để tìm nhưng tháng có số ngày giống
        switch (month) {
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
            default:
                System.out.println("Có 31 ngày");
                break;
        }




    }
}
