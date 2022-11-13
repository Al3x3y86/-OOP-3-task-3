import java.util.Objects;

public class Predators extends Mammals{

    private String typeOfFood;

    public Predators(String nickname, int year, String habitat, double travelSpeed, String typeOfFood) {
        super(nickname, year, habitat, travelSpeed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String toString() {
        return "Хищник: " + getNickname()+", количество лет-" + getYear()+ ", Среда проживания -" +getHabitat() +
                ", скорость перемещения - " + getTravelSpeed() + ", тип пищи - "+ typeOfFood + ".";
    }
    @Override
    public void eat (){
        System.out.println("Хищные животные едят мясо.");
    }
    @Override
    public void move (){
        System.out.println("Хищные животные перемещаются в поисках добычи.");
    }

    @Override
    public void sleep() {
        System.out.println("Хищные животные спят чтобы отдохнуть после охоты.");
    }

    @Override
    public void walk() {
        System.out.println("Хищные животные гуляют по своей территории.");
    }

    public void hunt () {
        System.out.println("Хищные животные охотятся ради пищи.");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
