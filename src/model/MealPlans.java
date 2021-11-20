package model;

public class MealPlans {
    private String mealPlanNo;
    private String mealPlanName;

    public MealPlans(String mealPlanNo, String mealPlanName) {
        this.setMealPlanNo(mealPlanNo);
        this.setMealPlanName(mealPlanName);
    }

    public MealPlans() {
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
}
