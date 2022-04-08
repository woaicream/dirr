package exchanger1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        //核心线程数量
        ThreadPoolExecutor t1=new ThreadPoolExecutor(2,
                //最大线程数
                5,
                //空闲线程最大持续时间
                2,
                //时间单位
                TimeUnit.HOURS,
                //任务队列
                new ArrayBlockingQueue<>(10),
                //创建线程工厂
                Executors.defaultThreadFactory(),
                //任务的拒绝策略
                new ThreadPoolExecutor.AbortPolicy());


        t1.submit( new Myrunnable());
        t1.submit( new Myrunnable());

        t1.shutdown();
    }
}
