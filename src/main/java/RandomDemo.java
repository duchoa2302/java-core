import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // tạo số  ngẫu nhiên
        int a = random.nextInt();
        System.out.println("a = " + a);
        // tìm là 1 số lớn hơn 0 nhỏ hơn 100  0<= random.intNext(max)< max
        int b = random.nextInt(100);

        System.out.println(b);

         // min<= min+ random.intNext(max - min  + 1)< max
        int min = 100;
        int max = 999;
        int c = min + random.nextInt(max - min +1);
        System.out.println("c = "+c);

       // Random một phần tử trong mảng
        String[] fruits = {"Cam", "Táo", "Ổi", "Lê", "Dứa"};
        int index = random.nextInt(fruits.length);
        String fruit = fruits[index];
        System.out.println("fruit = " + fruit);
    }
}
