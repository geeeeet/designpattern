package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.meal;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.food.ColdDrink;

/**
 * @author lirufeng
 * @date 2019/11/10 下午 2:45
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
