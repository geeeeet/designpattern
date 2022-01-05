package lrf.designpattern.creationalpattern.PrototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述
 *
 * @author lirufeng
 * @version 1.0.0
 * @date 2022/01/04 17:43:24
 */
public class PhoneCache {

    private static Map<Long,Phone> map = new HashMap<>();

    // 每次获取对象都是得到相应手机类型的一个克隆对象,深拷贝
    public static Phone getPhone(Long typeId) {
        Phone phone = map.get(typeId);
        return  (Phone)phone.clone();
    }

    public static void loadCache() {
        Huawei huawei = new Huawei();
        huawei.setId(1L);
        map.put(huawei.getId(),huawei);

        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setId(2L);
        map.put(xiaomi.getId(),xiaomi);
    }
}
