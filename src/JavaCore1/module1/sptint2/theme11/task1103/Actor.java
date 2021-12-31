package JavaCore1.module1.sptint2.theme11.task1103;

import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return firstName.equals(actor.firstName) && lastName.equals(actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
