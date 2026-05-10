import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }


    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " уже есть в спектакле!");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() + " добавлен в спектакль!");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + surname + " заменён на " + newActor.getName() + " " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден!");
    }

    public void printActors() {
        System.out.println("Спектакль \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  Список актёров пуст");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  - " + actor);
            }
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.getName() + " " + director.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration &&
                Objects.equals(title, show.title) &&
                Objects.equals(director, show.director) &&
                Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, director, listOfActors);
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}
