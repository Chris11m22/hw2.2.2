import java.util.Objects;

public class Predator extends Mammal {
    private String food;

    public Predator(String name, int age, String place, int speed, String food) {
        super(name, age, place, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }
    public static void huntint(){
        System.out.println("Время охоты");
    }
    public static void eat() {
        System.out.println("Лювлю добычу");
    }

    public static void go () {
        System.out.println("Иду в логово");
    }

    @Override
    public String toString() {
        return "Predator{"+ "name='" + getName() + '\'' + ", age=" + getAge()  + "food='" + food + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(food, predator.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }
}
