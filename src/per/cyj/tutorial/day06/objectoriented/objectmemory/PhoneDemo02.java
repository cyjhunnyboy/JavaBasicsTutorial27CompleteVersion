package per.cyj.tutorial.day06.objectoriented.objectmemory;

/**
 * 两个对象内存图
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

// 这是手机测试类
public class PhoneDemo02 {

    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "小米";
        p.price = 1999;
        p.color = "红色";
        System.out.println(p.brand + "---" + p.price + "---" + p.color);
        p.call("风清扬");
        p.sendMessage();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "华为";
        p2.price = 1699;
        p2.color = "黑色";
        System.out.println(p2.brand + "---" + p2.price + "---" + p2.color);
        p2.call("令狐冲扬");
        p2.sendMessage();
        p2.playGame();
    }
}
