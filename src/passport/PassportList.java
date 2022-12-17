package passport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PassportList {

    private Set<Passport> passportList=new HashSet<>();

    public Set<Passport> getPassportList() {
        return passportList;
    }

    //добавление человека с паспортом, если номер паспорта совпадает,
    // то меняются поля человека.
    public void addPassport(Passport passport) {
        Passport old = check(passport.getNumber());
        if (old != null) {
            getPassportList().remove(old);
            getPassportList().add(passport);
        }
        getPassportList().add(passport);
    }

    // метод поиска человека по паспорту
    public Passport check(String number) {
        for (Passport passport : getPassportList()) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportList that = (PassportList) o;
        return Objects.equals(passportList, that.passportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportList);
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passportList=" + passportList +
                "\n";
    }

    public PassportList() {
            }
}
