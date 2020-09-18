package per.cyj.tutorial.day06.objectoriented.objectmemory;

/**
 * 三个对象内存图
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

// 这是手机测试类
public class PhoneDemo03 {

    public static void main(String[] args) {
        Phone p1 = new Phone();

        p1.brand = "魅族";
        p1.price = 2000;
        p1.color = "黑色";
        System.out.println(p1.brand + "---" + p1.price + "---" + p1.color);

        Phone p2 = new Phone();
        p2.brand = "锤子";
        p2.price = 1600;
        p2.color = "黑色";
        System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);

        Phone p3 = p1;
        System.out.println(p3.brand + "---" + p3.price + "---" + p3.color);

        p3.brand = "酷派";
        p3.price = 2999;
        p3.color = "土豪金";
        System.out.println(p1.brand + "---" + p1.price + "---" + p1.color);
    }
}
