package viwe.tm;

import javafx.scene.control.Button;

public class MealPlansTM {
    private String mealPlanNo;
    private String mealPlanName;
    private Button button;

    public MealPlansTM(String mealPlanNo, String mealPlanName, Button button) {
        this.setMealPlanNo(mealPlanNo);
        this.setMealPlanName(mealPlanName);
        this.setButton(button);
    }

    public MealPlansTM() {
    }

    public String getMealPlanNo() {
        return mealPlanNo;
    }

    public void setMealPlanNo(String mealPlanNo) {
        this.mealPlanNo = mealPlanNo;
    }

    public String getMealPlanName() {
        return mealPlanName;
    }

    public void setMealPlanName(String mealPlanName) {
        this.mealPlanName = mealPlanName;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }
}
