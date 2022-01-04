package lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample;

import lrf.designpattern.creationalpattern.BuilderPattern.aComplexSample.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个 Meal 类，带有上面定义的 Item 对象。
 * @author lirufeng
 * @date 2019/11/10 下午 2:50
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    /**
     * 将套餐所需的食物合在一块
     * @param item
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * 计算每个套餐的总金额
     * @return
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 打印套餐
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
