import java.util.Objects;

public class Amphibians extends Animals {
    private String place;

    public Amphibians(String name, int age, String place) {
        super(name, age);
        this.place = " пруд";
    }


    public String getPlace() {
        return place;
    }

    public static void hunt() {
        System.out.println("Время охотится");
    }

    public static void eat() {
        System.out.println("Лювлю мух");
    }

    public static void go() {
        System.out.println("Нахожу новое место");
    }


    @Override
    public String toString() {
        return "Amphibians{" + "name='" + getName() + '\'' + ", age=" + getAge() +  "place='" + place + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place);
    }
}
