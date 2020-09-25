package per.cyj.tutorial.day07.thiskeyword;

/**
 * 标准手机类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    手机类：
        成员变量
            品牌：String brand;
            价格：int price;
            颜色：String color;
        成员方法：
            针对每一个成员变量给出对应的getXxx()/setXxx()方法。
 */
public class Phone {

    // 品牌
    private String brand;

    // 价格
    private int price;

    // 颜色
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
