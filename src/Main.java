public class Main {
    public static void main(String[] args) {

        System.out.println("Травоядные");
        Herbivores gazelle = new Herbivores("Газель",3,"Африка",50,"растения");
        System.out.println(gazelle);
        Herbivores giraffe = new Herbivores("Жираф",4,"Африка",60,"растения");
        System.out.println(giraffe);
        Herbivores horse = new Herbivores("Лошадь",2,"конюшня",88,"растения");
        System.out.println(horse);
        gazelle.eat();
        giraffe.move();
        horse.graze();
        gazelle.walk();
        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(horse.equals(giraffe));

        System.out.println("Хищники");
        Predators hyena = new Predators("Гиена",1,"Африка",64,"мясо");
        System.out.println(hyena);
        Predators tiger = new Predators("Тигр",4,"Азия",65,"мясо");
        System.out.println(tiger);
        Predators bear = new Predators("Медведь",6,"Дальний Восток",56,"всеядный");
        System.out.println(bear);
        hyena.eat();
        tiger.move();
        bear.hunt();
        hyena.walk();
        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.equals(bear));
        System.out.println(tiger.equals(bear));

        System.out.println("Земноводные");
        Amphibians grassSnakes = new Amphibians("Уж пресноводный",2,"Юго-Восточная Азия");
        System.out.println(grassSnakes);
        Amphibians frog = new Amphibians("Лягушка",2,"пресные водоемы");
        System.out.println(frog);
        frog.eat();
        frog.sleep();
        grassSnakes.move();
        grassSnakes.hunt();
        System.out.println(frog.equals(grassSnakes));

        System.out.println("Нелетающие птицы");
        Flightless peacock = new Flightless("Павлин", 3,"речные берега","по земле");
        System.out.println(peacock);
        Flightless penguin = new Flightless("Пингвин", 2,"Антарктида","по земле");
        System.out.println(penguin);
        Flightless dodoBird = new Flightless("Птица Додо", 1,"остров Маврикий","по земле");
        System.out.println(dodoBird);
        peacock.eat();
        penguin.sleep();
        dodoBird.walk();
        peacock.hunt();
        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodoBird));
        System.out.println(penguin.equals(dodoBird));

        System.out.println("Летающие птицы");
        Flying gull = new Flying("Чайка", 1,"морских просторы","полет");
        System.out.println(gull);
        Flying albatross = new Flying("Альбатрос", 2,"Южный океан","полет");
        System.out.println(albatross);
        Flying falcon = new Flying("Сокол", 3,"повсеместно","полет");
        System.out.println(falcon);
        gull.eat();
        albatross.sleep();
        falcon.fly();
        gull.hunt();
        System.out.println(gull.equals(albatross));
        System.out.println(gull.equals(falcon));
        System.out.println(albatross.equals(falcon));



    }
}