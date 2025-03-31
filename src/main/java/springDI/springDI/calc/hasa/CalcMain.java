package springDI.springDI.calc.hasa;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CalcMain {
    public static void main(String[] args) {

        // Spring 의 di를 통한 객체 생성
        // main() 에서 Spring Framework 의 환경을 만들어야됨.

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/hasa-calc-annotation.xml"); // 설정 xml 문서 전달
        HasaCalculator hasaCalculator = (HasaCalculator) context.getBean("hasaCalculator"); // id 기준으로 객체를 DI
        System.out.println(hasaCalculator.add(3, 7));
        context.close();
    }
}
