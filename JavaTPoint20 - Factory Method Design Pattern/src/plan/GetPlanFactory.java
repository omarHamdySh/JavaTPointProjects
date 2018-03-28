package plan;

/**
 *
 * @author abdo_
 */
public class GetPlanFactory {

    /**
     * use getPlan method to get object of type Plan, this approach is better
     * than a static factory inside the absract class, because inside a parent
     * you should not talk about children
     *
     * This method can be static also, and it would be a good approach.
     */
    public Plan getPlan(String planType) {
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
