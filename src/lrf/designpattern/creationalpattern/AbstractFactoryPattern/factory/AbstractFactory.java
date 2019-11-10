package lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 14:52
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
