public class Main {
    public static void main(String[] args) {
        Amphibians kwa = new Amphibians("Лягушка ", 2," ");
        kwa.a();
        Amphibians shh = new Amphibians("Уж",3," ");
        shh.a();
        Herbivorous gazelle = new Herbivorous("Газель", 4, "саванна", 100, "трава");
        Herbivorous giraffe = new Herbivorous("Жираф", 2, "саванна", 100, "трава");
        Herbivorous horse = new Herbivorous("Лощадь", 4, "саванна", 100, "трава");
        gazelle.b();
        giraffe.b();
        horse.b();
        predator hyena = new predator("Гиена", 6, "саванна", 100, "мясо");
        predator tiger = new predator("Тигр", 8, "джунгли", 100, "мясо");
        predator bear = new predator("Медведь", 4, "лес", 100, "мясо");
        hyena.c();
        tiger.c();
        bear.c();
        flightless peacock = new flightless("Павлин", 2, "зоопарк","пешком");
        flightless penguin = new flightless("Пингвин", 4, "полюс","пешком");
        flightless dodo = new flightless("Додо", 2, "лес","пешком");
        peacock.d();
        penguin.d();
        dodo.d();
        flying seagull = new flying("Чайка", 2, "озеро","летит");
        flying albatross = new flying("Альботрос", 4, "озеро","летит");
        flying falcon = new flying("Сокол", 2, "лес","летит");
        seagull.i();
        albatross.i();
        falcon.i();














    }
}