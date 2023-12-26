import java.time.Year;

public class TestAutomobiles {

    public static void applicationTemplate(Automobile automobile){
        System.out.println("\n");
        System.out.println(" --------------------------------------------------------------------------------------------- ");
        System.out.println("                                       XYZ Automobiles                                         ");
        System.out.println(" --------------------------------------------------------------------------------------------- ");
        System.out.println(" ID number: "+automobile.getIdNumber()                                                          );
        System.out.println(" Make: "+automobile.getMake()                                                                   );
        System.out.println(" Model: "+automobile.getModel()                                                                 );
        System.out.println(" Color: "+automobile.getColor()                                                                 );
        System.out.println(" Year: "+automobile.getYear()                                                                   );
        System.out.println(" Miles per gallon: "+automobile.getMilesPerGallon()                                             );
    }
    public static void main(String[] args){

        Automobile automobile1 = new Automobile(1234,"Toyota","Camry","Silver", 2020,28);
        Automobile automobile2 = new Automobile(7890,"Ford","Mustang","Red",2003,22);
        Automobile automobile3 = new Automobile(3456,"Honda","Accord","Blue",2022,30);
        Automobile automobile4 = new Automobile(901234,"Chevrolet","Malibu","Black",2021,26);
        Automobile automobile5 = new Automobile(567,"Tesla","Model 3","White",2023,86);

        applicationTemplate(automobile1);
        applicationTemplate(automobile2);
        applicationTemplate(automobile3);
        applicationTemplate(automobile4);
        applicationTemplate(automobile5);

    }
}
