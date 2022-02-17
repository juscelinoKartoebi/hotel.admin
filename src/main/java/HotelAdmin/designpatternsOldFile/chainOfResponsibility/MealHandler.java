package HotelAdmin.designpatternsOldFile.chainOfResponsibility;

public interface MealHandler {

    void setNextMealHandler(MealHandler nextChain);

    void process(Meal meal);

    default void validate(Meal meal) {
        if (meal == null || meal.getMealType() == null || meal.getDescription() == null) {
            System.out.println("Er is geen valide meal type doorgegeven.");
            return;
        }
    }
}
