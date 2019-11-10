package lrf.designpattern.creationalpattern.BuilderPattern.food;

import lrf.designpattern.creationalpattern.BuilderPattern.item.Item;
import lrf.designpattern.creationalpattern.BuilderPattern.packing.Bottle;
import lrf.designpattern.creationalpattern.BuilderPattern.packing.Packing;

/**
 * @author lirufeng
 * @date 2019/11/10 下午 2:40
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
