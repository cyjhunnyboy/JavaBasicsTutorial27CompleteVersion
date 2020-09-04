package per.cyj.tutorial.day03;

/**
 * 关系运算符
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo07 {

    /*
        比较运算符：==  !=  >  >=  <  <=
        注意事项：
            1、无论你的操作是简单还是复杂，结果都是boolean类型
            2、"=="不能写成"="
     */
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 3;

        System.out.println(x == y); // false
        System.out.println(x == z); // true
        System.out.println((x + y) == (x + z)); // false
        System.out.println("====================");

        System.out.println(x != y); // true
        System.out.println(x > y);  // false
        System.out.println(x >= y); // false
        System.out.println(x < y);  // true
        System.out.println(x <= y); // true
        System.out.println("====================");

        int a = 10;
        int b = 20;
        boolean flag = (a == b); // false
        // 这个是有问题的，不兼容的类型
        // Error:(38, 27) java: 不兼容的类型: int无法转换为boolean
        // 把b赋值给a，然后把a留下来
        // boolean flag = (a = b);
        System.out.println(flag);
    }
}
