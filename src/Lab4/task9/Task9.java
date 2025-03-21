package Lab4.task9;

public class Task9 {
    public static void main(String[] args) {
        int sumV1 = sum(5, 6, 10);
        int sumV2 = sum(13, 50, 21, 3, 5, 16);
        int sumV3 = sum(1, 2);
        System.out.println("First sum is: " + sumV1);
        System.out.println("Second sum is: " + sumV2);
        System.out.println("Third sum is: " + sumV3);
    }
    public static int sum(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }
}
