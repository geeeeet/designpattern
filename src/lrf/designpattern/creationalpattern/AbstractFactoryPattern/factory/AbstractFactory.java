package lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;

/**
 * 抽象工厂，能生产这两种产品，当然也是抽象的产品，因此需要具体的工厂来实现
 *
 * @author lirufeng
 * @date 2019/1/25 14:52
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
