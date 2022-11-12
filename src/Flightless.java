import java.util.Objects;

public class Flightless extends Birds {

    private String movementType;

    public Flightless(String nickname, int year, String habitat, String movementType) {
        super(nickname, year, habitat);
        this.movementType = movementType;
    }

    public String toString() {
        return "Нелетающая птица: " + getNickname()+", количество лет-" + getYear()+ ", Среда проживания -"
                +getHabitat()  + ", тип передвижения - " + movementType + ".";
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
