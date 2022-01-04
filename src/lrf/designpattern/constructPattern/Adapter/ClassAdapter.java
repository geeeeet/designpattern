package lrf.designpattern.constructPattern.Adapter;

/**
 * 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 18:54:54
 */
public class ClassAdapter extends Adaptee implements Target{


    @Override
    public void request() {
        specificRequest();
    }
}
