import java.util.Objects;

public class Bird extends Animals {
    public String place;

    public Bird(String name, int age, String place) {
        super(name, age);
        if (place == null) {
            place = "небо";
        } else {
            this.place = place;
        }
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place == null) {
            place = "небо";
        } else {
            this.place = place;
        }
    }
        public static void hunt(){
            System.out.println("Охочусь");
        }
        public static void eat() {
            System.out.println("Лювлю добычу");
        }

        public static void go () {
            System.out.println("Лучу в гнездо");
        }

    @Override
    public String toString() {
        return "bird{"+ "name='" + getName() + '\'' + ", age=" + getAge()  + "place='" + place + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(place, bird.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), place);
    }
}

