package Lab7.Lesson.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Q8", "Audi", 2015);

        Employee worker = new Employee();
        worker.setSalery(1000);
        System.out.println(worker.getSalery());
    }
}
