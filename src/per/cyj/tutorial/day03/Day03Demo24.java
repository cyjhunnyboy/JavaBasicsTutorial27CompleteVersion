package per.cyj.tutorial.day03;

/**
 * 选择结构
 *
 * @author chenyongjun
 * @since 2020-02-06
 */
public class Day03Demo24 {

    /*
        if语句格式2：
            if(关系表达式) {
                语句体1;
            }else{
                语句体2;
            }
            执行流程：先计算关系表达式的值，看其返回值结果是true还是false
            如果是true，则执行语句体1，否则执行语句体2
         注意：else后面是没有关系表达式的，只有if语句后面有关系表达式
     */
    public static void main(String[] args) {
        // 判断两个数据是否相等
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a等于b");
        } else {
            System.out.println("a不等于b");
        }
    }
}
