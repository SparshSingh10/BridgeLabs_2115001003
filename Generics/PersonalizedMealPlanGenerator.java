
interface MealPlan {
    String getMealPlan();
}

class VegetarianMeal implements MealPlan {
    private String pName;

    public VegetarianMeal(String pName) {
        this.pName = pName;
    }


    public String getMealPlan() {
        return "Vegetarian Meal Plan: " + pName;
    }

    public String toString() {
        return pName;
    }
}

class VeganMeal implements MealPlan {
    private String pName;

    public VeganMeal(String pName) {
        this.pName = pName;
    }

    public String getMealPlan() {
        return "Vegan Meal Plan: " + pName;
    }

    public String toString() {
        return pName;
    }
}

class HighProteinMeal implements MealPlan {
    private String pName;

    public HighProteinMeal(String pName) {
        this.pName = pName;
    }

    public String getMealPlan() {
        return "High Protein Meal Plan: " + pName;
    }

    public String toString() {
        return pName;
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public String toString() {
        return mealPlan.toString();
    }

}

class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        if (validatePlan(plan)) {
            return new Meal<>(plan);
        }
        throw new IllegalArgumentException("Invalid meal plan");
    }

    private static <T extends MealPlan> boolean validatePlan(T plan) {
        return plan.getMealPlan() != null && !plan.getMealPlan().isEmpty();
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = MealPlanGenerator.generateMealPlan(new VegetarianMeal("Healthy Veg Delight"));
        Meal<VeganMeal> vegan = MealPlanGenerator.generateMealPlan(new VeganMeal("Green Energy"));
        Meal<HighProteinMeal> protein = MealPlanGenerator
                .generateMealPlan(new HighProteinMeal("Muscle Builder"));
        System.out.println(veg);
        System.out.println(vegan);
        System.out.println(protein);
    }
}