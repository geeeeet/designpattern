package lrf.designpattern.creationalpattern.BuilderPattern.item;

import lrf.designpattern.creationalpattern.BuilderPattern.packing.Packing;

/**
 * 创建一个表示食物条目和食物包装的接口。
 * @author lirufeng
 * @date 2019/11/10 下午 2:33
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
