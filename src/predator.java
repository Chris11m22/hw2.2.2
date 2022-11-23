public class predator extends mammal {
    private String food;

    public predator(String name, int age, String place, int speed, String food) {
        super(name, age, place, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }
    public static void huntint(){
        System.out.println("Время охоты");
    }
    public static void eat() {
        System.out.println("Лювлю добычу");
    }

    public static void go () {
        System.out.println("Иду в логово");
    }
    public void c() {

        System.out.println(getName() + " возраст " + getAge() + " место " + getPlace() + " скорость " + getSpeed() + " еда " + getFood());
    }

}
