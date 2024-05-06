public class TernaryDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int max = (a > b) ? a : b;
        // nếu a lớn hơn b thì kết quả đúng là kết quả sau dấu ? và sau dấu : là ngược lại
        System.out.println("max = " + max);
    }
}
