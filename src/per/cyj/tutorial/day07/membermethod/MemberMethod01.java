package per.cyj.tutorial.day07.membermethod;

/**
 * 成员方法
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class MemberMethod01 {

    public static void main(String[] args) {
        // 创建对象
        Member01 m = new Member01();

        // 调用无参无返回值方法
        m.show();

        // 调用无参有返回值方法
        String res1 = m.getString();
        System.out.println(res1);

        // 调用有参无返回值方法
        m.method("林青霞");

        // 调用有参有返回值方法
        String res2 = m.func("Hello", ", World!");
        System.out.println(res2);
    }
}
