import java.time.LocalDate;

public class TestWedding {
    public static void displayWeddingDetails(Wedding wedding) {
        System.out.println("Wedding Date: " + wedding.getDateOfWedding());
        Couple couple = wedding.getCouples();
        Person person1 = couple.getPerson1();
        Person person2 = couple.getPerson2();
        System.out.println("Couple: " + person1.getFirstName() + " " + person1.getLastName() + " and " +
                person2.getFirstName() + " " + person2.getLastName());
        System.out.println("Location: " + wedding.getLocation());
        System.out.println();
    }
    public static void main(String[] args) {

        LocalDate firstWeddingDate = LocalDate.of(2023, 11, 27);
        LocalDate secondWeddingDate = LocalDate.of(2023, 12, 15);

        Wedding traditionalWedding = new Wedding(
                firstWeddingDate,
                "WestWorld",
                new Couple(
                        new Person(
                                "Tommy",
                                "Black",
                                LocalDate.of(1987, 4, 13)
                        ),
                        new Person(
                                "Anny",
                                "WaterWhale",
                                LocalDate.of(1992, 6, 19)
                        )
                )
        );

        displayWeddingDetails(traditionalWedding);
    }
}
