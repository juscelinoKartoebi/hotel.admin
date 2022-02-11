package HotelAdmin.designpatterns.chainOfResponsibility;

import static HotelAdmin.designpatterns.chainOfResponsibility.MealTypeConstant.BREAKFAST;

public class BreakfastHandler implements MealHandler {
    private MealHandler nextMealHandler;

    @Override
    public void setNextMealHandler(MealHandler nextVerlofHandler) {
        this.nextMealHandler = nextVerlofHandler;
    }

    @Override
    public void process(Meal meal) {
        if (meal == null || meal.getMealType() == null || meal.getDescription()  == null) {
            System.out.println("Er is geen valide meal type doorgegeven.");
            return;
        }
        if (BREAKFAST.equals(meal.getMealType())) {
            //handel de verlof aanvraag af
//            meal.setGoedgekeurd(true);
            System.out.println("Ingredienten: " + meal.getDescription());
        } else {
            this.nextMealHandler.process(meal);
        }
    }
}
