package per.cyj.tutorial.day06.objectoriented.classandobject.objectuse;

/**
 * 手机类使用
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

// 这是手机测试类
public class PhoneDemo {

    public static void main(String[] args) {
        // 类名 对象名 = new 类名();
        Phone phone = new Phone();

        // 输出成员变量的值
        // System.out.println(phone.brand);
        // System.out.println(phone.price);
        // System.out.println(phone.color);
        System.out.println(phone.brand + "---" + phone.price + "---" + phone.color);

        // 给成员变量赋值
        phone.brand = "iPhone 6s plus";
        phone.price = 6000;
        phone.color = "玫瑰金";
        System.out.println(phone.brand + "---" + phone.price + "---" + phone.color);

        // 调用方法
        phone.call("林青霞");
        phone.sendMessage();
        phone.playGame();
    }
}
