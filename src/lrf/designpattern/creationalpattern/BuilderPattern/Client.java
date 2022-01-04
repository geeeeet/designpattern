package lrf.designpattern.creationalpattern.BuilderPattern;

/**
 * 描述
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 14:38:56
 */
public class Client {

    public static void main(String[] args) {

        ConcreteBuilder builder = new ConcreteBuilder();

        Director director = new Director(builder);

        // 得到完整产品
        Product product = director.constructProduct();

        product.show();


    }
}
