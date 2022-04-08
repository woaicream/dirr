package demo3;

public class phone {
    //属性 成员变量 变量名;
/*
* 品牌
* */
    String brand;
/*
* 价格
* */
    double c;
// 行为（成员方法）：去掉static

    /*
    *打电话的功能
    *phoneNumber 电话号码
    * */
public void call (String phoneNumber){
    System.out.println("正在给"+phoneNumber+"打电话");
}
public void Sendmessage(String phoneNumber,String message){
    System.out.println("正在给"+phoneNumber+"发送短信，短信内容是"+message);

}

    public int show(String str){
        System.out.println("有参数返回值的方法:"+str);
        return 100;
    }
}
