package lrf.designpattern.creationalpattern.FactoryPattern;

/**
 * TODO
 *
 * @author lirufeng
 * @date 2019/1/25 12:47
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
