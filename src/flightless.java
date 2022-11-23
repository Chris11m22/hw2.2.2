import java.util.Objects;

public class flightless extends bird {
    public String move;

    public flightless(String name, int age, String place, String move) {
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

    public void d() {
        System.out.println(getName() + " возраст " + getAge() + " место " + getPlace() + " " + getMove());
    }


    }

