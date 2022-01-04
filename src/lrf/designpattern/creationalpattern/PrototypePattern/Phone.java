package lrf.designpattern.creationalpattern.PrototypePattern;


/**
 * 抽象类，实现了{@link Cloneable}接口
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 16:49:05
 */
public abstract class Phone implements Cloneable {

    private Long id;
    protected String name;

    public abstract String phoneName();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
