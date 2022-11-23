public class bird extends Animals {
    public String place;

    public bird(String name, int age, String place) {
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
        return "bird{" +
                "place='" + place + '\'' +
                '}';
    }
}

