package per.cyj.tutorial.day07.training;

/**
 * 员工信息类
 *
 * @author chenyongjun
 * @since 2020-02-09
 */

/*
    需求：
        定义一个员工类，自己分析出几个成员
        然后给出成员变量，构造方法，getXxx()/SetXxx方法，
        以及一个显示所有员工信息的方法，并测试
    分析：
        员工类：
            成员变量：
                1、员工编号
                2、姓名
                3、年龄
                4、职位
                5、薪水
            构造方法：
                1、无参构造方法
                2、带参数构造方法
            成员方法：
                1、getXxx()/setXxx()
                2、shou()
 */
public class Employee {

    /**
     * 员工编号
     */
    private String employeeId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 职位
     */
    private String position;

    /**
     * 薪水
     */
    private double salary;

    /**
     * 无参构造方法
     */
    public Employee() {
    }

    /**
     * 带全部参数的构造方法
     *
     * @param employeeId 员工编号
     * @param name       姓名
     * @param age        年龄
     * @param position   职位
     * @param salary     薪水
     */
    public Employee(String employeeId, String name, int age, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    /**
     * 获取员工编号
     *
     * @return 员工编号
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 设置员工编号
     *
     * @param employeeId 员工编号
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * 获取姓名
     *
     * @return 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取职位
     *
     * @return 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职位
     *
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取薪水
     *
     * @return 薪水
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置薪水
     *
     * @param salary 薪水
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * 显示所有成员信息的方法
     */
    public void show() {
        System.out.println("员工编号是'" + employeeId + "'的这个人是'"
                + name + "'的年龄是'" + age + "'的职位是'" + position + "'的薪水是" + salary + "'");
    }
}
