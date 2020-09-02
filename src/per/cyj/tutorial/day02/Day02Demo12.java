package per.cyj.tutorial.day02;

/**
 * 数据类型
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day02Demo12 {

    public static void main(String[] args) {
        byte a = 3;
        int b = 4;

        // 这个肯定没有问题
        int c = a + b;
        System.out.println("c = " + c);

        // 抱错，byte参与运算自动向上转型int
        // byte c1 = a + b;

        /*
            数据类型强制转换：从大的数据类型到小的数据类型。
            格式：目标数据类型 变量 = (目标数据类型) (被转换的数据)
            注意：不要随意的去使用强制转换，因为它隐含了精度损失问题
         */
        byte c2 = (byte) (a + b);
        System.out.println(c2);

        byte x = 3, y = 4, z;
        // x,y是变量，因为变量的值会变化，不确定具体的值，所有默认使用int类型进行存储
        // 编译报错
        // z = x + y;
        z = (byte) (x + y);
        System.out.println("z = " + z);
        int z1 = 3 + 4;
        System.out.println(z1);
    }
}
