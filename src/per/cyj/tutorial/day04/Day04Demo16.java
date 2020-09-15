package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo16 {

    /*
        练习：请在控制台输出满足如下条件的五位数（回文数）
        1、个位等于万位
        2、十位等于千位
        3、个位+十位+千位+万位=百位
        分析：
        1、五位数就告诉了我们范围
        2、分解每一个五位数的个、十、百、千、万位上的数据
        3、按照要求进行判断即可
     */
    public static void main(String[] args) {
        // 五位数其实告诉我们了数据范围
        for (int i = 10000; i < 100000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            int wan = i / 10 / 10 / 10 / 10 % 10;

            // 按照要求进行判断即可
            if ((ge == wan) && (shi == qian) && (ge + shi + qian + wan == bai)) {
                System.out.println(i);
            }
        }
    }
}
