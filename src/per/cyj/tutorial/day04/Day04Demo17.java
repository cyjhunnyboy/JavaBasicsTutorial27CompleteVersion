package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo17 {

    /*
        需求：统计“水仙花数”共有多少个
        分析：
        1、首先必须知道什么是“水仙花数”：一个三位数，其各位数字的立方和等于该数本身
           举例 153=1*1*1+5*5*5+3*3*3=1+125+27=153
        2、定义统计变量，初始化值为0
        3、三位数圈定了范围，用for循环
        4、获取每一个三位数的个、十、百位上的数
        5、按照要求进行判断
        6、如果满足就进行统计个数
     */
    public static void main(String[] args) {
        // 定义统计变量，初始化值0
        int count = 0;

        // 三位数其实告诉我们了数据范围，用for循环即可
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (i == (ge * ge * ge + shi * shi * shi + bai * bai * bai)) {
                count++;
            }
        }

        System.out.println("三位数的'水仙花数'共有" + count + "个");
    }
}
