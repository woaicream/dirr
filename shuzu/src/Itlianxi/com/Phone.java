package Itlianxi.com;

public class Phone {
   //类的品牌  价格
    String band;
    Double price;
//行为(成员方法)：去掉static
    public void call(String phoneNum) {
        System.out.println("正在给" + phoneNum + "打电话...");}

        public void sendMessage(String phoneNum,String message){
            System.out.println("正在给" + phoneNum + "发送短信，短信内容是:" + message);
        }
    }

