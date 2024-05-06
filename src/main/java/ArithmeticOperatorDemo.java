public class ArithmeticOperatorDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        // int c = 100%10; phép chia lấy dư 100
       // float c = 105f % 10; // lấy ra số dư là 5
        //  System.out.println("c = " + c);
        // toán tử viết tắt += -= /= %=
        a += 10;  // a = a + 10 ; giống a += 10;
        System.out.println("a = " + a);
        // int d = b;
        // b = b + 1;  đặt ++ ở sau thì nó sẽ cho b = d và cộng 1 ở b chứ k cộng vào b rồi gắn vào d
        int d = b++;
        System.out.println("d = " + d);
         // đặt ++ ở trước thì nó sẽ cộng b trước rồi lấy kêt quả gắn vào e
         // b = b + 1;
        // int e = b;

        int e = ++b;
        System.out.println("e = " + e);















    }

}

