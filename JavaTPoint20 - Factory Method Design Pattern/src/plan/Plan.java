package plan;

/**
 *
 * @author abdo_
 */
public abstract class Plan {

    protected double rate;

    public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

    /**
     * use getPlan method to get object of type Plan
     *
     * This would be know as Static Factory Method, to know more about it, check
     * this link https://stackoverflow.com/q/929021/3578711 .
     */
    public static Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
