package lrf.designpattern.creationalpattern.BuilderPattern.food;

import lrf.designpattern.creationalpattern.BuilderPattern.item.Item;
import lrf.designpattern.creationalpattern.BuilderPattern.packing.Packing;
import lrf.designpattern.creationalpattern.BuilderPattern.packing.Wrapper;

/**
 * @author lirufeng
 * @date 2019/11/10 下午 2:37
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
