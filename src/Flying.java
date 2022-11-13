import java.util.Objects;

public class Flying extends Birds {

    private String movementType;

    public Flying(String nickname, int year, String habitat, String movementType) {
        super(nickname, year, habitat);
        this.movementType = movementType;
    }

    @Override
    public String toString() {
        return "Летающая птица: " + getNickname()+", количество лет-" + getYear()+ ", Среда проживания -"
                +getHabitat()  + ", тип передвижения - " + movementType + ".";
    }

    @Override
    public void eat() {
        System.out.println("Летающие птицы едят насекомых, грызунов и рыбу.");
    }

    @Override
    public void move() {
        System.out.println("Летающие птицы передвигаются в поисках еды.");
    }

    @Override
    public void sleep() {
        System.out.println("Летающие птицы спят в гнездах.");
    }

    @Override
    public void hunt() {
        System.out.println("Летающие птицы охотятся на насекомых, грызунов и рыбу.");
    }

    public void fly () {
        System.out.println("Полёт является наиболее специфической формой передвижения птиц.");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = movementType;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
