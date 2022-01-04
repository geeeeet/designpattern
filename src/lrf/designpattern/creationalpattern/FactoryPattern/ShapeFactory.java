package lrf.designpattern.creationalpattern.FactoryPattern;

/**
 * 工厂，用于生产具体的类型
 *
 * @author lirufeng
 * @date 2019/1/25 12:49
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    protected Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
