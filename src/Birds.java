import java.util.Objects;

public abstract class Birds extends Animals {

    private String habitat;

    public Birds(String nickname, int year, String habitat) {
        super(nickname, year);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = habitat;
        }
    }
    @Override
    public abstract void eat();

    @Override
    public abstract void move();

    @Override
    public abstract void sleep();

    public abstract void hunt ();

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(habitat, birds.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
