package Lab4.Lesson;

public class Mathods3 {
    // global scope
    static int num1 = 3;
    public static void main(String[] args) {
        // local scope
        System.out.println(num1);
        int num1 = 5;
        System.out.println(num1);
        anotherFunction();
    }
    public static void anotherFunction(){
        // local scope
        System.out.println(num1);
    }
}
