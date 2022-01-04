package lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Circle;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Rectangle;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Square;

/**
 * 生产Shape的具体工厂，Shape本身有多种类型
 *
 * @author lirufeng
 * @date 2019/1/25 14:55
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor (String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null || "".equals(shape)) {
            return null;
        } else if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }
}
