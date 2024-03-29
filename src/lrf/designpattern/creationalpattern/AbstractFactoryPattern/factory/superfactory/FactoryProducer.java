package lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.superfactory;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.AbstractFactory;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.ColorFactory;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.ShapeFactory;

/**
 * 工厂的消费者，能根据产品类型生产相应的工厂
 *
 * @author lirufeng
 * @date 2019/1/25 15:06
 */
public class FactoryProducer {

    public static AbstractFactory getFactory (String factory) {
        if (factory == null || "".equalsIgnoreCase(factory)) {
            return null;
        } else if ("Color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        } else if ("Shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        }
        return null;
    }
}
