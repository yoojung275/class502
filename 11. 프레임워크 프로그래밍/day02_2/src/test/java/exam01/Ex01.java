package exam01;

import org.junit.jupiter.api.Test;

public class Ex01 {

    @Test
    void test1() {

        long stime = System.nanoTime(); // 공통 기능
        ImplCaculator cal1 = new ImplCaculator();

        long result1 = cal1.factorial(10L); // 핵심 기능

        System.out.printf("cal1=%d%n", result1);
        long etime = System.nanoTime(); // 공통 기능
        System.out.printf("cal1 걸린 시간:%d%n", etime - stime);

        stime = System.nanoTime(); // 공통 기능
        RecCalculator cal2 = new RecCalculator();

        long result2 = cal2.factorial(10L); // 핵심 기능
        
        System.out.printf("cal2=%d%n", result2);
        etime = System.nanoTime(); // 공통 기능
        System.out.printf("cal2 걸린 시간:%d%n", etime - stime);
    }

    @Test
    void test2() {
        // 데코레이터 패턴
        ProxyCalculator cal1 = new ProxyCalculator(new ImplCaculator());

        long result1 = cal1.factorial(10L);
        System.out.printf("cal1=%d%n", result1);

        ProxyCalculator cal2 = new ProxyCalculator(new RecCalculator());

        long result2 = cal2.factorial(10L);
        System.out.printf("cal2=%d%n", result2);
    }
}
