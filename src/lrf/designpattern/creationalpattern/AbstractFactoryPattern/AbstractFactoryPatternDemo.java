package lrf.designpattern.creationalpattern.AbstractFactoryPattern;

import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Color;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.AbstractFactory;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.factory.superfactory.FactoryProducer;
import lrf.designpattern.creationalpattern.AbstractFactoryPattern.Inter.Shape;

/**
 * 抽象工厂模式
 *
 * @author lirufeng
 * @date 2019/1/25 15:42
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        // 获取颜色工厂对象
        AbstractFactory factory = FactoryProducer.getFactory("Color");

        // 获取颜色对象
        Color color = factory.getColor("Red");
        // 调用颜色的方法
        color.fill();
        Color color1 = factory.getColor("Blue");
        color1.fill();
        Color color3 = factory.getColor("Green");
        color3.fill();


        // 获取类型工厂对象
        AbstractFactory factory1 = FactoryProducer.getFactory("Shape");

        // 获取形状对象
        Shape shape = factory1.getShape("Circle");
        // 调用形状的方法
        shape.draw();
        Shape shape1 = factory1.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = factory1.getShape("Square");
        shape2.draw();

    }

}
