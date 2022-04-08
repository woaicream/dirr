package wdsd;

//import java.util.Scanner;
//定义一个方法，该方法接收一个int参数，判断该数据是否是偶数，并返回真假值
public class lianxi {
   public static void main(String[] args) {
      int result =getMax(100,200);
        System.out.println("100和200的最大值"+result);

       /* Scanner sc = new Scanner(System.in);
        System.out.println("您输入第一个身高");
        int h1 =sc.nextInt();

        System.out.println("您输入第二个身高");
        int h2 =sc.nextInt();

        System.out.println("您输入第三个身高");
        int h3 =sc.nextInt();

        System.out.println(h1+"..."+h2+"..."+h3);


        int temp=(h1>h2)?h1:h2;

        int Max=(temp>h3)?temp:h3;

        System.out.println("三个和尚的最大身高为"+Max);
        */

    }
    public static int getMax(int a ,int  b){
        int Max =(a > b)?a:b;
        return Max;

    }
}
