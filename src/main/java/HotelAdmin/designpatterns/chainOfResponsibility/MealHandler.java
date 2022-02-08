package HotelAdmin.designpatterns.chainOfResponsibility;

public interface MealHandler {
    void setNextVerlofHandler(MealHandler nextChain);

    void process(Meal verlof);

    default void validate(Meal meal) {
        if (meal == null || meal.getMealType() == null || meal.getDescription() == null) {
            System.out.println("Er is geen valide verlof type doorgegeven.");
            return;
        }
    }
}
