package lrf.designpattern.creationalpattern.BuilderPattern;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.Meal;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.meal.ChickenBurger;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.meal.Coke;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.meal.Pepsi;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.meal.VegBurger;

/**
 * 创建一个 MealBuilder 类，实际的 builder 类负责创建 Meal 对象。
 * 现在我们来创建我们套餐有哪些食物
 *
 * 属于指挥者
 * @author lirufeng
 * @date 2019/11/10 下午 2:55
 */
public class MealBuilder {

    /**
     * 第一个套餐
     * @return
     */
    public Meal prepareChickenBurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 第二个套餐
     * @return
     */
    public Meal prepareCoke() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    /**
     * 第三个套餐
     * @return
     */
    public Meal preparePepsi() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 第四个套餐
     * @return
     */
    public Meal prepareVegBurger() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
