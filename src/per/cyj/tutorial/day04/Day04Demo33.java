package per.cyj.tutorial.day04;

/**
 * return语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo33 {

    /*
        小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
        她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
     */
    public static void main(String[] args) {
        double dayMoney = 2.5;
        int dayCount = 1;

        while (dayMoney <= 100) {
            if (dayCount % 5 == 0) {
                dayMoney -= 6;
            }
            dayMoney += 2.5;
            dayCount++;
        }

        System.out.println("经过" + dayCount + "天，小芳才可以存到100元钱");
    }
}
