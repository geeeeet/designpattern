package lrf.designpattern.creationalpattern.BuilderPattern;

/**
 * 具体建造者：实现了抽象建造者。
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 14:33:05
 */
public class ConcreteBuilder extends Builder{


    @Override
    public void buildPartA() {
        product.setPartA("buildPartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("buildPartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("buildPartC");
    }
}
