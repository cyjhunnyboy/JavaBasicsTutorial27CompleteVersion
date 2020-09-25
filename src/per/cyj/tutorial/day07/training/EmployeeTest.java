package per.cyj.tutorial.day07.training;

/**
 * 员工信息测试类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */
public class EmployeeTest {

    public static void main(String[] args) {
        // 创建对象
        Employee employee = new Employee();

        // 给成员变量赋值
        employee.setEmployeeId("czbk9527");
        employee.setName("周星驰");
        employee.setAge(20);
        employee.setPosition("Java高级讲师");
        employee.setSalary(15000);

        // 获取数据
        employee.show();
    }
}
