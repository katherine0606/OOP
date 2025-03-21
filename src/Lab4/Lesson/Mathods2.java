package Lab4.Lesson;

public class Mathods2 {
    public static void main(String[] args) {
        int sumV = addVarargs(1, 3, 10);
        System.out.println("Sum is: " + sumV);
    }

    static int addVarargs(int... numbers){
        int sum = 0;
        for(int num : numbers){
            sum+=num;
        }
        return  sum;
    }
}
