import java.util.Objects;

public class Herbivores extends Mammals{

    private String typeOfFood;

    public Herbivores(String nickname, int year, String habitat, double travelSpeed, String typeOfFood) {
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
        System.out.println("Травоядные животные едят траву и листья.");
    }
    @Override
    public void move (){
        System.out.println("Травоядные животные перемещаются в поисках еды.");
    }
    @Override
    public void walk() {
        System.out.println("Травоядные животные любят гулять.");
    }
    @Override
    public void sleep() {
        System.out.println("Травоядные животные спят чтобы набраться сил.");
    }

    public void graze (){
        System.out.println("Травоядные животные пасутся на пастбищах.");
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
