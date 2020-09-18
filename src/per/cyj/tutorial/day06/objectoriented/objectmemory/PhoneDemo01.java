package per.cyj.tutorial.day06.objectoriented.objectmemory;

/**
 * 一个对象内存图
 *
 * @author chenyongjun
 * @since 2020-02-08
 */

public class PhoneDemo01 {

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand + " " + phone.price + " " + phone.color);

        phone.brand = "三星";
        phone.price = 3999;
        phone.color = "白色";
        System.out.println(phone.brand + " " + phone.price + " " + phone.color);

        phone.call("乔布斯");
        phone.sendMessage();
        phone.playGame();
    }
}
