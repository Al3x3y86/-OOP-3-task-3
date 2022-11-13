import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    private String nickname;
    private int year;

    public Animals(String nickname, int year) {
        if (nickname == null || nickname.isEmpty() || nickname.isBlank()) {
            this.nickname = nickname;
        }
        this.nickname = nickname;
        if ( year < 0  ) {
            this.year = LocalDate.now().getYear() -Math.abs(year);
        }
        this.year = year;
    }

    public abstract void eat ();

    public abstract void move ();

    public abstract void sleep ();

    public String getNickname() {
        return nickname;
    }

      public void setNickname(String nickname) {
        if (nickname == null || nickname.isEmpty() || nickname.isBlank()) {
            this.nickname = nickname;
        }
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return year == animals.year && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, year);
    }
}
