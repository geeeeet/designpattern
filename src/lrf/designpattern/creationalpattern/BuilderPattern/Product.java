package lrf.designpattern.creationalpattern.BuilderPattern;

/**
 * 产品角色：包含多个组成部件的复杂对象。
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 14:30:14
 */
public class Product {

    // 产品角色：包含多个组成部件的复杂对象。
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show() {
        //显示产品的特性
        System.out.println("partA="+partA);
        System.out.println("partB="+partB);
        System.out.println("partC="+partC);

    }
}
