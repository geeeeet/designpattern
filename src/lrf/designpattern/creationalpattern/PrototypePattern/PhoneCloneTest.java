package lrf.designpattern.creationalpattern.PrototypePattern;

/**
 * 原型模式
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 17:49:26
 */
public class PhoneCloneTest {

    public static void main(String[] args) {

        PhoneCache.loadCache();

        Phone phone = PhoneCache.getPhone(1L);
        phone.setName("22222");
        System.out.println(phone.phoneName());

        Phone phone1 = PhoneCache.getPhone(1L);
        phone1.setName("2222223232323");
        System.out.println(phone.hashCode()== phone1.hashCode());

        System.out.println(phone.getName());

    }
}
