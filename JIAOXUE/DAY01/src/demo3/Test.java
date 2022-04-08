package demo3;

public class Test {
    public static void main(String[] args) {
        //对象的创建：
        // 对象的创建格式：类名 对象名=new 类名 （）；
        //结论：类也是一个数据类型，是引用数据类型；
        //创建一个类的对象
        //访问成员变量
        /*给成员变量赋值  对象名.成员变量名 = 值；
        获取成员变量的值
         */
        //访问成员方法
        phone P1=new phone();
        P1.brand="华为";
        P1.c=999;
        //获取P1对象的C的成员变量的值
        System.out.println(P1.brand);
        System.out.println(P1.c);

       //直接调用      无返回值 方法名（实参)
        P1.show("it");
        //赋值调用
        int res = P1.show("itcast");
        System.out.println("res="+res);
        //输出调用
        System.out.println(P1.show("java"));
    }

}
