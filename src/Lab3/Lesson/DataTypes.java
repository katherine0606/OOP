package Lab3.Lesson;

public class DataTypes {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);
        num1 = 5;
        System.out.println(num1);
        System.out.println(num2);
        String[] cars1 = {"Ford", "Audi", "BMW"};
        String[] cars2 = cars1;
        for(String car : cars1) {
            System.out.println("cars1: " + car);
        }
        for (String car : cars2){
            System.out.println("cars2: " + car);
        }
        cars1[0] = "Volvo";

        System.out.println("-------------------");
        for (String car : cars1){
            System.out.println("car1: " + car);
        }

        for (String car : cars2){
            System.out.println("cars2: " + car);
        }
    }
}
