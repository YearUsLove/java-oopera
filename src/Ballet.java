import java.util.Objects;

public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ballet ballet = (Ballet) o;
        return Objects.equals(choreographer, ballet.choreographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choreographer);
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "title='" + getTitle() + '\'' +
                ", choreographer='" + choreographer + '\'' +
                '}';
    }
}