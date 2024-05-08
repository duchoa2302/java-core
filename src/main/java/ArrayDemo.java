public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6,8,9,7};
        String[] names = new String[]{"khoa", "hoa", "hai"};
        int[]array = new int[0]; // kết quả bằng o

        // kích thước của mảng
        System.out.println("numbers.length" + numbers.length);
        System.out.println("names.length = " + names.length);
        System.out.println("array.length = " + array.length);
        //chỉ số    của mảng bắt đầu từ o

        // truy cập dựa theo chỉ số (index)
        System.out.println("names[1] = " +names[1]);
        int lastIndex = numbers.length -1; // tìm chỉ số lớn nhất
        System.out.println("name[lastIndex]" +numbers[lastIndex]);

        // lặp các phần tử trong mảng
        for (int i =0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
        // in ra các phần tử từ phải qua trái

        for(int i = numbers.length - 1; i >=0; i--){
            System.out.println("numbers[" + i +"]= " +numbers[i]);
        }

        // ("numbers[" + i +"]= ")










    }

}
