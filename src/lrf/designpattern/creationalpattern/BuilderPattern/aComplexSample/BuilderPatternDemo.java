package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample;

/**
 * 一个比较复杂的例子
 * @author lirufeng
 * @date 2019/11/10 下午 3:06
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegBurger();
        System.out.println("VegBurger Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal pepsi = mealBuilder.preparePepsi();
        System.out.println("\n\nPepsi Meal");
        pepsi.showItems();
        System.out.println("Total Cost: " +pepsi.getCost());

        Meal coke = mealBuilder.prepareCoke();
        System.out.println("\n\nCoke Meal");
        coke.showItems();
        System.out.println("Total Cost: " +coke.getCost());

        Meal chickenBurger = mealBuilder.prepareChickenBurger();
        System.out.println("\n\nChickenBurger Meal");
        chickenBurger.showItems();
        System.out.println("Total Cost: " +chickenBurger.getCost());
    }
}
