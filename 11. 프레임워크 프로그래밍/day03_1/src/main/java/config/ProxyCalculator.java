package config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}

    @Before("publicTarget()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before...");
    }

    @After("publicTarget()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After...");
    }

    @AfterReturning(value = "publicTarget()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("AfterReturning :" + returnValue);
    }
        @AfterThrowing(value = "publicTarget()", throwing = "e")
        public void afterThrowing(JoinPoint joinPoint, Throwable e) {
            System.out.println("AfterThrowing...");
            e.printStackTrace();
        }

        @Around("publicTarget()")
        public Object process(ProceedingJoinPoint joinPonint) throws Throwable {
/*
            Signature sig = joinPonint.getSignature(); //호출된 메서드 정의 정보
            System.out.println(sig.toLongString());

            Object[] args = joinPonint.getArgs(); //인수 정보
            System.out.println(Arrays.toString(args));

            Object obj = joinPonint.getTarget(); //호출한 메서드를 가지고 있는 객체
            System.out.println(obj.getClass());

 */

            long stime = System.nanoTime();
            boolean re = false;
            if (!re) {
                throw new RuntimeException("에외 테스트...");
            }
            try {
                Object result = joinPonint.proceed(); //핵심 기능 대신 실행 - factorial 메서드



                return result;
            } finally {
                long etime = System.nanoTime();
                System.out.printf("걸린시간: %d\n", etime - stime);
            }
        }
    }
