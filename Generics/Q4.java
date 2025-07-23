interface MealPlan {
    String getPlanName();
}

class VegetarianMeal implements MealPlan {
    public String getPlanName() { return "Vegetarian Meal Plan"; }
}

class VeganMeal implements MealPlan {
    public String getPlanName() { return "Vegan Meal Plan"; }
}

class KetoMeal implements MealPlan {
    public String getPlanName() { return "Keto Meal Plan"; }
}

class HighProteinMeal implements MealPlan {
    public String getPlanName() { return "High-Protein Meal Plan"; }
}

class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public T getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return meal.getPlanName();
    }
}

class MealPlanner {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        System.out.println("Validating and generating meal plan...");
        return new Meal<>(meal);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = generateMealPlan(new VegetarianMeal());
        Meal<KetoMeal> ketoMeal = generateMealPlan(new KetoMeal());

        System.out.println(vegMeal);
        System.out.println(ketoMeal);
    }
}
