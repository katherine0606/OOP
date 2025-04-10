package Lab7.Lesson.Encapsulation;

public class Employee {
    private String name;
    private int age;
    private int salery;

    public String getName() {
        return name;
    }

    public int getSalery() {
        return salery;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }
}
