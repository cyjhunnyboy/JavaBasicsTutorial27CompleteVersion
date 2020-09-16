package per.cyj.tutorial.day04;

/**
 * continue语句
 *
 * @author chenyongjun
 * @since 2020-02-07
 */
public class Day04Demo31 {

    /*
        练习题：
            for(int x=0; x<=10; x++) {
                if(x%3==0) {
                    // 此处填写代码
                }
                System.out.println("Java基础班");
            }

            我想在控制台输出2次："Java基础班"
            break;
            我想在控制台输出7次："Java基础班"
            我想在控制台输出13次："Java基础班"
     */
    public static void main(String[] args) {
        // 控制台输出2次："Java基础班"
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                // 此处填写代码
                break;
            }
            System.out.println("Java基础班");
        }

        System.out.println("---------------------");

        // 控制台输出7次："Java基础班"
        for (int j = 1; j <= 10; j++) {
            if (j % 3 == 0) {
                // 此处填写代码
                continue;
            }
            System.out.println("Java基础班");
        }

        System.out.println("---------------------");

        // 控制台输出13次："Java基础班"
        for (int k = 1; k <= 10; k++) {
            if (k % 3 == 0) {
                // 此处填写代码
                System.out.println("Java基础班");
                System.out.println("Java基础班");
                continue;
            }
            System.out.println("Java基础班");
        }
    }
}
