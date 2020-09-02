package per.cyj.tutorial.day02;

/**
 * 标识符：就是给类、接口、方法、变量等起名字
 * <p>
 * 组成规则：
 * <br>A：英文字母大小写
 * <br>B：数字字符
 * <br>C：$和_
 * <p>
 * 注意事项：
 * <br>A：不能以数字开头
 * <br>B：不能是Java中的关键字
 * <br>C：Java语言严格区分大小写
 *
 * @author chenyongjun
 * @since 2020-02-05
 */
public class Day02Demo02 {

    public static void main(String[] args) {
        // 正确的写法
        int x = 100;

        // 不能以数字开头
        // 编译报错，提示“不是语句”
        // int 1y = 100;

        // 不能是Java中的关键字
        // 编译报错，提示“非法的表达式开始”
        // int public = 100;

        // 编译通过，运行正确，说明Java语言严格区分大小写
        // int Public = 100;
        System.out.println("Hello, World! x = " + x);
    }
}
