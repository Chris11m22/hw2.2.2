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

    public static void go () {
        System.out.println("Нахожу новое место");
    }


    public void a () {
       System.out.println(getName() + " возраст " + getAge() + " место" + getPlace());
    }
}
