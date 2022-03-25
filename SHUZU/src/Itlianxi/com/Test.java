package Itlianxi.com;

public class Test {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        Phone p1=new Phone();
        p1.band="huawei";
        p1.price=999.8;
        String str= p1.band;
        System.out.println(p1.band);
        System.out.println(p1.price);
        p1.call("10086");
    }
}

