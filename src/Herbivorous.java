import java.util.Objects;

public class Herbivorous extends mammal{
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
    public static void go () {
        System.out.println("Ищу вкусную траву");
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), food);
    }

    public void b () {
    System.out.println(getName() + " возраст " + getAge() + " место " + getPlace() + " скорость " + getSpeed() + " еда " + getFood());
}


}

