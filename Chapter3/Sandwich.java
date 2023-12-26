public class Sandwich {
    private String main;
    private String type;
    private double price;

    public void setMainIngredient(String mainIngredient){
        main = mainIngredient;
    }
    public void setIngredientType(String ingredientType){
        type = ingredientType;
    }
    public void setSandwichPrice(double amount){
        price = amount;
    }

    public String getMainIngredient(){
        return main;
    }
    public String getIngredientType(){
        return type;
    }
    public double getSandwichPrice(){
        return price;
    }
}