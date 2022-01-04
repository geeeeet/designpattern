package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.food;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.item.Item;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.packing.Packing;
import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.packing.Wrapper;

/**
 * 抽象的建造者
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
