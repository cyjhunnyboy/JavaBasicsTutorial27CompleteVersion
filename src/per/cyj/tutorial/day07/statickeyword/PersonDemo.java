package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class PersonDemo {

    public static void main(String[] args) {
        // 创建对象1
        Person p1 = new Person("邓丽君", 20, "中国");
        p1.show();

        // 创建对象2
        // Person p2 = new Person("杨幂", 23, "中国");
        Person p2 = new Person("杨幂", 23);
        p2.show();

        // 创建对象3
        // Person p3 = new Person("欧阳娜娜", 20, "中国");
        Person p3 = new Person("欧阳娜娜", 20);
        p3.show();

        p3.country = "美国";
        p3.show();

        p1.show();
        p2.show();
    }
}
