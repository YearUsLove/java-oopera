import java.util.Objects;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthor, that.musicAuthor) &&
                Objects.equals(librettoText, that.librettoText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), musicAuthor, librettoText);
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "title='" + getTitle() + '\'' +
                ", duration=" + getDuration() +
                ", director=" + getDirector() +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}

