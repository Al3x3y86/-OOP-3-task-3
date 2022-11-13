import java.util.Objects;

public class Amphibians extends Animals {

    private String habitat;

    public Amphibians(String nickname, int year, String habitat) {
        super(nickname, year);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = habitat;
        }
    }

    @Override
    public String toString() {
        return "Земноводные: " + getNickname()+", количество лет-" + getYear()+ ", Среда проживания -" +getHabitat()  + ".";
    }

    @Override
    public void eat() {
        System.out.println("Земноводные едят насекомых, моллюсков, червей.");
    }

    @Override
    public void move() {
        System.out.println("Земноводные передвигаются в поиска еды.");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводные спят в безопасных местах.");
    }
    public void hunt () {
        System.out.println("Земноводные охотятся на насекомых, моллюсков, червей.");
    }

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
        Amphibians that = (Amphibians) o;
        return Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
