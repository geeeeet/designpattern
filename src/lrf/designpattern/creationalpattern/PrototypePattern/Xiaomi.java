package lrf.designpattern.creationalpattern.PrototypePattern;

/**
 * 描述
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 17:38:07
 */
public class Xiaomi extends Phone{

    public Xiaomi() {
        this.name = "xiaomi";
    }

    @Override
    public String phoneName() {
        return "我是小米";
    }
}
