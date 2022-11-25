import java.util.Objects;

public class Mammal extends Animals {
    private String place;
    private int speed;

    public Mammal(String name, int age, String place, int speed) {
        super(name, age);
        this.place = place;
        this.speed = speed;
    }

    public String getPlace() {
        return place;
    }

    public int getSpeed() {
        return speed;
    }
    public static void walk() {
        System.out.println("Гуляю по лугу");
    }
        public static void eat() {
            System.out.println("Ем листья");
        }

        public static void go () {
            System.out.println("Ищу тихое место");
        }

    @Override
    public String toString() {
        return "Mammal{"+ "name='" + getName() + '\'' + ", age=" + getAge() + "place='" + place + '\'' + ", speed=" + speed + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(place, mammal.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place, speed);
    }
}



