import java.util.Objects;

public class Herbivorous extends Mammal {
    public String food;

    public Herbivorous(String name, int age, String place, int speed, String food) {
        super(name, age, place, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public static void graze() {
        System.out.println("Пасусь на лугу");
    }

    public static void eat() {
        System.out.println("Ем траву");
    }

    public static void go() {
        System.out.println("Ищу вкусную траву");
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    @Override
    public String toString() {
        return "Herbivorous{" + "name='" + getName() + '\'' + ", age=" + getAge() + "food='" + food + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(food, that.food);
    }
}

