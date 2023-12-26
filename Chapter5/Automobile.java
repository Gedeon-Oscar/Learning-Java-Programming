public class Automobile {
    private int IdNumber;
    private String make;
    private String model;
    private String color;
    private int year;
    private int milesPerGallon;

    public Automobile(int idNumber, String make, String model, String color, int year, int milesPerGallon) {

        setIdNumber(idNumber);
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMilesPerGallon(milesPerGallon);

    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int idNumber) {
        if (idNumber >= 0 && idNumber <= 9999) {
            this.IdNumber = idNumber;
        } else {
            this.IdNumber = 0;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2005 && year <= 2019) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        if (milesPerGallon >= 10 && milesPerGallon <= 60) {
            this.milesPerGallon = milesPerGallon;
        } else {
            this.milesPerGallon = 0;
        }
    }
}
