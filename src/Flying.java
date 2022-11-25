import java.util.Objects;

public class Flying extends Bird {
     public String moving;

    public Flying(String name, int age, String place, String moving) {
        super(name, age, place);
        if (moving == null) {
            this.moving = "летает";
        }else {
            this.moving = moving;
        }
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {
        if (moving == null) {
            this.moving = "летает";
        }else {
        this.moving = moving;
    }

}
    public static void huntint(){
        System.out.println("Время охоты");
    }
    public static void eat() {
        System.out.println("Лювлю добычу");
    }

    public static void go () {
        System.out.println("Иду домой");
    }
    public static void walk() {
        System.out.println("Гуляю по берегу");
    }

    @Override
    public String toString() {
        return "Flying{" + "name='" + getName() + '\'' + ", age=" + getAge() + "moving='" + moving + '\'' + ", place='" + place + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(moving, flying.moving);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moving);
    }
}


