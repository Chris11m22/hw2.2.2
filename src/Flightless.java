import java.util.Objects;

public class Flightless extends Bird {
    public String move;

    public Flightless(String name, int age, String place, String move) {
        super(name, age, place);
        if (move == null) {
            move = "пешком";
        } else {
            this.move = move;
        }
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        if (move == null) {
            move = "пешком";
        } else {
            this.move = move;
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
        return "Flightless{" + "name='" + getName() + '\'' + ", age=" + getAge() + "move='" + move + '\'' + ", place='" + place + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(move, that.move);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), move);
    }
}

