package per.cyj.tutorial.day07.standantversion;

/**
 * 标准手机类测试类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class PhoneTest {

    public static void main(String[] args) {
        // 创建手机类对象
        Phone phone = new Phone();

        // 给成员变量赋值
        phone.setBrand("iPhone 11");
        phone.setPrice(8000);
        phone.setColor("玫瑰金");

        // 获取成员变量值并输出控制台
        System.out.println(phone.getBrand() + "---" + phone.getPrice() + "---" + phone.getColor());
    }
}
