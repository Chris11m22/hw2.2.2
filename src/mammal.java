public class mammal extends Animals {
    private String place;
    private int speed;

    public mammal(String name, int age, String place, int speed) {
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

    }



