package lrf.designpattern.creationalpattern.PrototypePattern;

/**
 * 描述
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 17:37:58
 */
public class Huawei extends Phone{

    public Huawei() {
        this.name = "huawei";
    }

    @Override
    public String phoneName() {
        return "我是华为";
    }
}
