package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSimple.packing;

/**
 * 创建实现 Packing 接口的实体类。
 * @author lirufeng
 * @date 2019/11/10 下午 2:35
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
