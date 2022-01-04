package lrf.designpattern.creationalpattern.FactoryPattern;

/**
 * 具体Shape的实现
 *
 * @author lirufeng
 * @date 2019/1/25 12:48
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
