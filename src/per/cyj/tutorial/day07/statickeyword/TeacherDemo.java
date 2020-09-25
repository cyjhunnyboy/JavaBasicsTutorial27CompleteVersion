package per.cyj.tutorial.day07.statickeyword;

/**
 * static关键字注意事项
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class TeacherDemo {

    public static void main(String[] args) {
        // 创建对象
        Teacher t = new Teacher();
        t.show();
        System.out.println("-------------");
        t.method();
    }
}
