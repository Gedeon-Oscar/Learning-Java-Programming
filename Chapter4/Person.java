import java.time.LocalDate;

public class Person {
    public String firstName,lastName;
    public LocalDate dateOfBirth;

    Person(String a, String b, LocalDate c){
        this.firstName = a;
        this.lastName = b;
        this.dateOfBirth = c;
    }

    String getFirstName(){
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
    LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
}
