import java.time.LocalDate;

public class Wedding {
    public LocalDate dateOfWedding;
    public String location;
    public Couple couples;

    Wedding(LocalDate a,String b,Couple c){
        this.dateOfWedding = a;
        this.location = b;
        this.couples = c;
    }

    LocalDate getDateOfWedding(){ return dateOfWedding; }
    String getLocation(){ return location; }
    Couple getCouples(){ return couples; }
}
