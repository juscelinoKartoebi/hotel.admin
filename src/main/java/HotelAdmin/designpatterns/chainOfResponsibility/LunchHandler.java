package HotelAdmin.designpatterns.chainOfResponsibility;

import static HotelAdmin.designpatterns.chainOfResponsibility.MealTypeConstant.LUNCH;

public class LunchHandler implements MealHandler {

        private MealHandler mealHandler;

        @Override
        public void setNextVerlofHandler(MealHandler nextVerlofHandler) {
            this.mealHandler = nextVerlofHandler;
        }

        public void process(Meal verlof) {
            if (verlof == null || verlof.getMealType() == null || verlof.getDescription()  == null) {
                System.out.println("Er is geen valide verlof type doorgegeven.");
                return;
            }

            if (LUNCH.equals(verlof.getMealType())) {
                //handel de verlof aanvraag af
//                verlof.setGoedgekeurd(true);
                System.out.println("Het " + LUNCH+ " is goedgekeurd!");
            } else {
                this.mealHandler.process(verlof);
            }
        }
}
