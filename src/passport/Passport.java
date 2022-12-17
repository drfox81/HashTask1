package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String number;
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate birthday;

    public Passport(String number, String firstName, String secondName, String patronymic, LocalDate birthday) {
        this.number = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.birthday = birthday;

    }


    public void setNumber(String number) {
        this.number = number;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return  number + " " +
                firstName + " " + secondName + " " +
                patronymic + " " + birthday+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
