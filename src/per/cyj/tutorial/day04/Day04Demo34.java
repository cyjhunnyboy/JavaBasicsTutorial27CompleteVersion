package per.cyj.tutorial.day04;

/**
 * return语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo34 {

    /*
        小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
        她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

        分析：
            1、小芳的妈妈每天给她2.5元钱
                double dayMoney = 2.5;
            2、她都会存起来
                double daySum = 0;
            3、从第一天开始存储
                int dayCount = 1;
            4、经过多少天，小芳才可以存到100元钱
                double result = 100;
            5、每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
                说明要判断dayCount的值，如果对5整除就减去6元钱
                daySum -= 6;
                由此还隐含一个问题，如果不是5的倍数，钱要累加
                daySum += dayMoney
            6、因为不知道是多少天，所以我用死循环，一旦超过100元就退出死循环
     */
    public static void main(String[] args) {

        // 每天要存储的钱是2.5元
        double dayMoney = 2.5;
        // 存钱的初始化值是0
        double daySum = 0;
        // 从第一天开始存储
        int dayCount = 1;
        // 最终存储不小于100就不存储了
        int result = 100;

        // 因为不知道是多少天，所以用死循环
        while (true) {
            // 累加钱
            daySum += dayMoney;

            // 一旦超过100元我就退出循环
            if (daySum >= result) {
                System.out.println("共花了" + dayCount + "天存储了100元");
                break;
            }

            if (dayCount % 5 == 0) {
                // 花去6元钱
                daySum -= 6;
                System.out.println("第" + dayCount + "天花了6元钱");
            }

            // 天数变化
            dayCount++;
        }
    }
}
