public class ContinueDemo {
    public static void main(String[] args) {
            for (int i = 1; i <=10; i++){
             if( i== 5) {
                 continue; // không nhận (5) mà bỏ qua nhận dòng tiếp 6789
                }
                System.out.println(i);
            }
    }
}
