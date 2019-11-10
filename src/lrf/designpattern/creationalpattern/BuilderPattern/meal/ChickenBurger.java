package lrf.designpattern.creationalpattern.BuilderPattern.meal;

import lrf.designpattern.creationalpattern.BuilderPattern.food.Burger;

/**
 * @author lirufeng
 * @date 2019/11/10 下午 2:44
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
