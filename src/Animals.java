import java.util.Objects;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void eat() {
        System.out.println("Время есть");
    }

    public static void sleep() {
        System.out.println("Время спать ");
    }

    public static void go() {
        System.out.println(" Время перемещаться");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}


