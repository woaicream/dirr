package demo04_类和对象的练习;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();

    stu.name="xiaohua";
    stu.age=18;
        System.out.println(stu.name+","+stu.age);

        //访问成员方法
        stu.Study();
        stu.Dohomework();
    }
}
