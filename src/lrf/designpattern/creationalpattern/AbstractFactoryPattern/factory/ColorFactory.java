package lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Blue;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Green;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.impl.Red;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 15:02
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor (String color) {
        if (color == null || "".equals(color)) {
            return null;
        } else if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape (String shape) {
        return null;
    }
}
