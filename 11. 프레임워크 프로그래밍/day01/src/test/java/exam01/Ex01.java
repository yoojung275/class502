package exam01;

import exam01.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); //스프링 컨테이너 객체

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("정동화");

        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("조풍래");

        System.out.println(g1 == g2); //주소 비교 -> 주소가 같음 -> 싱글톤 형태로 객체 관리(Map 형태와 비슷)

        ctx.close();
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

  //싱글톤으로 기본 관리하므로 객체가 한개만 있는 경우가 많다
        //Class 클래스만 있어도 찾는다.
        Greeter g1 = ctx.getBean(Greeter.class);
        g1.hello("조풍래");

        ctx.close();
    }
}
