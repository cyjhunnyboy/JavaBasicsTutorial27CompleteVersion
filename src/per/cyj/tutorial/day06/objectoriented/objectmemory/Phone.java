package per.cyj.tutorial.day06.objectoriented.objectmemory;

/**
 * 手机类
 *
 * @author chenyongjun
 * @since 2020-02-08
 */
public class Phone {

    // 品牌
    String brand;   // 默认值：null
    // 价格
    int price;      // 默认值：0
    // 颜色
    String color;   // 默认值：null

    // 打电话的方法
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    // 发短信的方法
    public void sendMessage() {
        System.out.println("群发短信");
    }

    // 玩游戏的的方法
    public void playGame() {
        System.out.println("玩游戏");
    }
}

