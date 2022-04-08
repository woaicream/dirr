package exchanger1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//创建一个默认的线程池对象  池子默认是空的 默认最多可以容纳int类型的最大值

//参数不是初始值 是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor t1 =(ThreadPoolExecutor)executorService;
        System.out.println(t1.getPoolSize());
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
          Thread.sleep(2000);
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行了");
        });
        System.out.println(t1.getPoolSize());
        executorService.shutdown();
    }
}
