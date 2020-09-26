package per.cyj.tutorial.day08.utilclass;

/**
 * Math：类包含用于执行基本数学运算的方法
 * <p>
 * 由于Math类在java.lang包下，所以不需要导包。 特点： 没构造方法，因为它的成员全部都是静态方法
 * <p>
 * 掌握一个方法：获取随机数  public static double random()：返回带正号的double值，该值大于0.0小于1.0
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class MathDemo {

    public static void main(String[] args) {
        // 获取一个随机数
        double d = Math.random();
        System.out.println(d);

        System.out.println("----------------");

        // 需求：获取一个1-100之间的随机数
        for (int i = 0; i < 100; i ++) {
            int num = (int) (Math.random() * 100) + 1;
            System.out.println("num = " + num);
        }
    }
}
