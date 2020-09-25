package per.cyj.tutorial.day07.construction;

/**
 * 构造方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class ConstructDemo02 {

    public static void main(String[] args) {
        // 创建对象
        Construct2 c2 = new Construct2();
        c2.show();
        System.out.println("-----------------");

        // 创建对象2
        Construct2 c22 = new Construct2("林青霞");
        c22.show();
        System.out.println("-----------------");

        // 创建对象3
        Construct2 c23 = new Construct2(27);
        c23.show();
        System.out.println("-----------------");

        // 创建对象4
        Construct2 c24 = new Construct2("林青霞", 27);
        c24.show();
    }
}
