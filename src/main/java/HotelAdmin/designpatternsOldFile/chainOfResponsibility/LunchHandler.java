package HotelAdmin.designpatternsOldFile.chainOfResponsibility;

import static HotelAdmin.designpatternsOldFile.chainOfResponsibility.MealTypeConstant.LUNCH;

public class LunchHandler implements MealHandler {

        private MealHandler mealHandler;

        @Override
        public void setNextMealHandler(MealHandler nextMealHandler) {
            this.mealHandler = nextMealHandler;
        }
        public void process(Meal meal) {
            if (meal == null || meal.getMealType() == null || meal.getDescription()  == null) {
                System.out.println("Er is geen valide meal type doorgegeven.");
                return;
            }
            if (LUNCH.equals(meal.getMealType())) {
                //handel de verlof aanvraag af
//                meal.setGoedgekeurd(true);
                System.out.println("Your " + LUNCH + " is getting prepared!");
            } else {
                this.mealHandler.process(meal);
            }
        }
}
