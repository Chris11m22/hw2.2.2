public class flying extends bird{
     public String moving;

    public flying(String name, int age, String place, String moving) {
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

    public void i() {
        System.out.println(getName() + " возраст " + getAge() + " место " + getPlace() + " " + getMoving());
    }
}


