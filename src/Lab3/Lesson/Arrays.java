package Lab3.Lesson;

public class Arrays {
    public static void main(String[] args) {
        // array А = []
        // array B = A

        int[] array1;
        int array2[];

        String[] food = new String[5];
        food[0] = "Banana";
        food[1] = "Banana";
        food[2] = "Banana";
        food[3] = "Banana";
        food[4] = "Banana";

        int[] numbers = {1, 2, 100, 10000};

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element is: " + numbers[i]);
        }

        for (int el : numbers) {
            System.out.println("Foreach elment is = " + el);
        }
    }
}
