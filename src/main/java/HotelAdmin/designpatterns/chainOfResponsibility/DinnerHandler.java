package HotelAdmin.designpatterns.chainOfResponsibility;

import static HotelAdmin.designpatterns.chainOfResponsibility.MealTypeConstant.*;

public class DinnerHandler implements MealHandler {
    private MealHandler mealHandler;

    @Override
    public void setNextMealHandler(MealHandler nextVerlofHandler) {
        this.mealHandler = nextVerlofHandler;
    }

    @Override
    public void process(Meal meal) {
        if (meal == null || meal.getMealType() == null || meal.getDescription()  == null) {
            System.out.println("Er is geen valide meal type doorgegeven.");
            return;
        }

        if (DINNER.equals(meal.getMealType())) {
            //handel de meal aanvraag af
//            meal.setGoedgekeurd(true);
            System.out.println("Your " + DINNER + " is getting cooked!");
        } else {
            this.mealHandler.process(meal);
        }
    }
}
