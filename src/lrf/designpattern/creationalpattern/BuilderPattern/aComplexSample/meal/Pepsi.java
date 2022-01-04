package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.meal;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.food.ColdDrink;

/**
 * @author lirufeng
 * @date 2019/11/10 下午 2:47
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 30.5f;
    }
}
