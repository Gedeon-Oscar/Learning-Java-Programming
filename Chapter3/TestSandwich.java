public class TestSandwich {
    public static void main(String[] args){

        String main,type;
        double price;

        Sandwich sandwichObject = new Sandwich();

        sandwichObject.setMainIngredient("Tuna");
        sandwichObject.setIngredientType("Wheat");
        sandwichObject.setSandwichPrice(4.90);

        main = sandwichObject.getMainIngredient();
        type = sandwichObject.getIngredientType();
        price = sandwichObject.getSandwichPrice();

        System.out.println("This is what you ordered:: "+main+" with "+type+" for the base. \n"+
                "Which all totaled to :: $"+price);

    }
}
