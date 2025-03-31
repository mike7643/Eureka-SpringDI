package springDI.springDI.calc.hasa;

// Calculator 객체 필요
// CalcMain 의 Spring 컨테이너 통해 HasaCalculator 객체를 생성 (DI)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HasaCalculator {
    //Spring DI를 사용하지 않은 경우
//    Calculator calculator = new Calculator();

//------------------------------------------------------------
/*
    //Spring DI #1 field injection
    @Autowired
    Calculator calculator;

    public int add(int n1, int n2) {
        System.out.println("HasaCalculator.add()");
        return calculator.add(n1, n2);
    }*/
/*
    //Spring DI #2 setter injection
    Calculator calculator;

    @Autowired
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int n1, int n2) {
        System.out.println("HasaCalculator.add()");
        return calculator.add(n1, n2);
    }
    */

    //Spring DI #3 constructor injection
    Calculator calculator;

    @Autowired // 생성자 주입일 때는 안 붙혀도 됨.
    public HasaCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int add(int n1, int n2) {
        System.out.println("HasaCalculator.add()");
        return calculator.add(n1, n2);
    }
}
