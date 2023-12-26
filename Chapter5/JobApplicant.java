public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean isProcessing;
    private boolean isSpreadsheets;
    private boolean isDatabases;
    private  boolean isGraphics;

    JobApplicant(
            String name,
            String phoneNumber,
            boolean isProcessing,
            boolean isSpreadsheets,
            boolean isDatabases,
            boolean isGraphics)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isProcessing = isProcessing;
        this.isSpreadsheets = isSpreadsheets;
        this.isDatabases = isDatabases;
        this.isGraphics = isGraphics;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isProcessing() {
        return isProcessing;
    }

    public boolean isSpreadsheets() {
        return isSpreadsheets;
    }

    public boolean isDatabases() {
        return isDatabases;
    }

    public boolean isGraphics() {
        return isGraphics;
    }
}
