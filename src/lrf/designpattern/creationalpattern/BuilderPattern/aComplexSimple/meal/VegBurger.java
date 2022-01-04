package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.meal;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.food.Burger;

/**
 * 创建扩展了 Burger 和 ColdDrink 的实体类。
 * @author lirufeng
 * @date 2019/11/10 下午 2:41
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
