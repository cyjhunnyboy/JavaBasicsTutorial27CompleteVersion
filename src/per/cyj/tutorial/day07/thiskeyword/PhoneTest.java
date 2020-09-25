package per.cyj.tutorial.day07.thiskeyword;

/**
 * 标准类定义练习
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    作业：请把手机类写成一个标准类，然后创建对象测试功能

    手机类：
        成员变量
            品牌：String brand;
            价格：int price;
            颜色：String color;
        成员方法：
            针对每一个成员变量给出对应的getXxx()/setXxx()方法。
        最后定义测试：
            创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是：null---0---null
            然后通过setXxx()方法给成员变量赋值，再次输出结果。这一次的结果是：三星---2999---土豪金
 */
public class PhoneTest {

    public static void main(String[] args) {
        // 创建手机对象
        Phone phone = new Phone();

        // 直接输出默认值
        System.out.println(phone.getBrand() + "---" + phone.getPrice() + "---" + phone.getColor());

        // 给成员变量赋值
        phone.setBrand("三星");
        phone.setPrice(2999);
        phone.setColor("土豪金");

        // 再次输出
        System.out.println(phone.getBrand() + "---" + phone.getPrice() + "---" + phone.getColor());
    }
}
