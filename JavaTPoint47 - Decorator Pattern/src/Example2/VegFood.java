package Example2;

public class VegFood extends GenericFoodType {

    @Override
    public String prepareFood() {

        return "Veg Food";

    }

    @Override
    public double foodPrice() {

        return 50.0;

    }

}
