package HotelAdmin.designpatterns.chainOfResponsibility;

import java.time.LocalDate;

public class MealChain {
    private static MealHandler firstMealHandler;

    public MealChain() {
        //set the succesor of the handlers incase they cant process and need to pass the request to the next handler
        LunchHandler lunchHandler = new LunchHandler();
        DinnerHandler dinnerHandler = new DinnerHandler();
        BreakfastHandler breakfastHandler = new BreakfastHandler();

        lunchHandler.setNextMealHandler(dinnerHandler);
        dinnerHandler.setNextMealHandler(breakfastHandler);
        //set the first handler in the chain
        this.firstMealHandler = lunchHandler;
    }

//    public static void test(Meal meal) {
//        if(meal != null){
//            firstMealHandler.process(meal);
//        }
//    }

    public static void main(String[] args) {
        MealChain mealChain = new MealChain();
        Meal meal = new Meal("Dinner", "crunched toast with baked egg");
        mealChain.firstMealHandler.process(meal);
    }
}
