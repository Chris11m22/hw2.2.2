public class Main {
    public static void main(String[] args) {
        Amphibians kwa = new Amphibians("Лягушка ", 2, " ");
        System.out.println("kwa = " + kwa);
        Amphibians shh = new Amphibians("Уж", 3, " ");
        System.out.println("shh = " + shh);
        Herbivorous gazelle = new Herbivorous("Газель", 4, "саванна", 100, " трава");
        Herbivorous giraffe = new Herbivorous("Жираф", 2, "саванна", 100, " трава");
        Herbivorous horse = new Herbivorous("Лощадь", 4, "саванна", 100, " трава");
        System.out.println("gazelle = " + gazelle);
        System.out.println("giraffe = " + giraffe);
        System.out.println("horse = " + horse);
        Predator hyena = new Predator("Гиена", 6, "саванна", 100, "мясо");
        Predator tiger = new Predator("Тигр", 8, "джунгли", 100, "мясо");
        Predator bear = new Predator("Медведь", 4, "лес", 100, "мясо");
        System.out.println("hyena = " + hyena);
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);
        Flightless peacock = new Flightless("Павлин", 2, "зоопарк", "пешком");
        Flightless penguin = new Flightless("Пингвин", 4, "полюс", "пешком");
        Flightless dodo = new Flightless("Додо", 2, "лес", "пешком");
        System.out.println("peacock = " + peacock);
        System.out.println("penguin = " + penguin);
        System.out.println("dodo = " + dodo);
        Flying seagull = new Flying("Чайка", 2, "озеро", "летит");
        Flying albatross = new Flying("Альботрос", 4, "озеро", "летит");
        Flying falcon = new Flying("Сокол", 2, "лес", "летит");
        System.out.println("seagull = " + seagull);
        System.out.println("albatross = " + albatross);
        System.out.println("falcon = " + falcon);


    }

}