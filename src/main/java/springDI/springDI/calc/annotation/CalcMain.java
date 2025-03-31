package springDI.springDI.calc.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcMain {
    public static void main(String[] args) {

        // Spring 의 di를 통한 객체 생성
        // main() 에서 Spring Framework 의 환경을 만들어야됨.

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/calc-annotation.xml"); // 설정 xml 문서 전달
//        Calculator calculator = context.getBean(Calculator.class); // id 와 무관하게 객체를 DI
        Calculator calculator = (Calculator) context.getBean("abc"); // id 기준으로 객체를 DI
        System.out.println(calculator.add(3, 7));
        context.close();
    }
}
