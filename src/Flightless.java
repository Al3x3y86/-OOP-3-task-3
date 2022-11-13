import java.util.Objects;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String nickname, int year, String habitat, String movementType) {
        super(nickname, year, habitat);
        if (movementType == null || movementType.isEmpty() || movementType.isBlank()) {
            this.movementType = movementType;
        }
    }

    public String toString() {
        return "Нелетающая птица: " + getNickname()+", количество лет-" + getYear()+ ", Среда проживания -"
                +getHabitat()  + ", тип передвижения - " + movementType + ".";
    }

    @Override
    public void eat() {
        System.out.println("Нелетающие птицы едят растительную пищу, насекомых и рыбу.");
    }

    @Override
    public void move() {
        System.out.println("Нелетающие птицы передвигаются в поисках еды.");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающие птицы спят.");
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающие птицы охотятся на насекомых и рыбу.");
    }
    public void walk () {
        System.out.println("Нелетающие птицы передвигаются по земле.");
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
        Flightless that = (Flightless) o;
        return Objects.equals(movementType, that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}
