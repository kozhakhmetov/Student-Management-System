package Users;

import AdditionalClasses.PersonData;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

abstract public class User implements Comparable, Serializable, Cloneable {

    private String login;
    private String password;
    private PersonData data;

    public User(String name, String surname, String phoneNumber, String email, String login, String password) {
        data = new PersonData(name,surname,phoneNumber,email);
        this.login = login;
        this.password = password;
    }

    //private log TODO log



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Object o) {
        return 0; // TODO write compare to
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
