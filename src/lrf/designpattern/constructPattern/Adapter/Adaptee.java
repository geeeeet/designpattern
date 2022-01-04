package lrf.designpattern.constructPattern.Adapter;

/**
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 18:53:24
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
