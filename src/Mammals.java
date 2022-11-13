import java.util.Objects;

public abstract class Mammals extends Animals {

    private String habitat;
    private double travelSpeed;


    public Mammals(String nickname, int year, String habitat, double travelSpeed) {
        super(nickname, year);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = habitat;
        }
        if (Double.compare(travelSpeed, 0) <= 0) {
            this.travelSpeed = travelSpeed;
        }
    }

    public abstract void walk ();

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    public double getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(double travelSpeed) {
        if (Double.compare(travelSpeed, 0) <= 0) {
            this.travelSpeed = travelSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.travelSpeed, travelSpeed) == 0 && Objects.equals(habitat, mammals.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, travelSpeed);
    }
}
