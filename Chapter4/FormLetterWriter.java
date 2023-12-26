public class FormLetterWriter {

    public void displaySalutation(String  customersLastName){
        System.out.println("Dear Mr. "+customersLastName);
        System.out.println("Thank you for your recent order");
    }

    public void displaySalutation(String customersFirstName, String customersLastName){
        System.out.println("Dear "+ customersFirstName + " " + customersLastName);
        System.out.println("Thank you for your recent order");
    }

    public static void main(String[] args){
        FormLetterWriter object = new FormLetterWriter();
        object.displaySalutation("Mbemba");
        object.displaySalutation("Oscar","Mbemba");
    }
}
