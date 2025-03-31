package springDI.springDI.calc.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {
    public static void main(String[] args) {

        // Spring 의 di를 통한 객체 생성
        // main() 에서 Spring Framework 의 환경을 만들어야됨.

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalcConfiguration.class); // 설정 java configuration (annotation)
        Calculator calculator = (Calculator) context.getBean("calculator"); // id 기준으로 객체를 DI
        System.out.println(calculator.add(3, 7));
        context.close();
    }
}
