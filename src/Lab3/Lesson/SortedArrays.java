package Lab3.Lesson;

import java.util.Arrays;

public class SortedArrays {
    public static void main(String[] args) {
        String[] fruits = {"orange", "banna", "apple"};

        for (String fruit : fruits){
            System.out.println(fruit + "-");
        }
        System.out.println();
        Arrays.sort(fruits);
        System.out.println("Sorted array: ");
        for (String fruit : fruits){
            System.out.println(fruit + "-");
        }
        Arrays.fill(fruits, "default_fruit");
        System.out.println("Filled array: ");
        for (String fruit : fruits){
            System.out.println(fruit + "-");
        }
    }
}
