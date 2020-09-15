package per.cyj.tutorial.day04;

/**
 * for循环语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo18 {

    /*
        需求：请统计1-1000之间同时满足如下条件的数据有多少个
        1、对3整除余2
        2、对5整除余3
        3、对7整除余2
        分析：
        1、1-1000之间确定了范围，for循环
        2、每个数据要同时满足如下要求
            x % 3 == 2
            x % 5 == 3
            x % 7 == 2
        3、如果满足条件，统计数据即可，最后控制台输出统计变量
     */
    public static void main(String[] args) {
        // 定义统计变量，初始化值0
        int count = 0;

        // 1-1000确定了数据范围，用for循环即可
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("满足这样条件的数据共有：" + count + "个");
    }
}
