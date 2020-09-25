package per.cyj.tutorial.day07.standantversion;

/**
 * 标准的手机类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    一个标准代码的最终版
    手机类：
        成员变量：brand, price, color
        构造方法：无参
        成员方法：getXxx()/SetXxx()
 */
public class Phone {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 价格
     */
    private int price;

    /**
     * 颜色
     */
    private String color;

    /**
     * 无参构造方法
     */
    public Phone() {
    }

    /**
     * 获取手机品牌
     *
     * @return 返回手机品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置手机品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取手机价格
     *
     * @return 返回手机价格
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置手机价格
     *
     * @param price 价格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取手机颜色
     *
     * @return 返回手机颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置手机颜色
     *
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }
}
