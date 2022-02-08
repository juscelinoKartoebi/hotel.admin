package HotelAdmin.designpatterns.chainOfResponsibility;

import java.time.LocalDate;

public class Meal {
    private String mealType;
    private String description;


    public Meal() {
    }

    public Meal(String mealType, String description) {
        this.mealType = mealType;
        this.description = description;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String verlofType) {
        this.mealType = mealType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealType='" + mealType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
