package lrf.designpattern.creationalpattern.BuilderPattern;

/**
 * 指挥者：调用建造者中的方法完成复杂对象的创建。
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 14:35:26
 */
public class Director {


    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 产品构造与组装
    public Product constructProduct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        //return builder.product;
        return builder.getResult();
    }
}
