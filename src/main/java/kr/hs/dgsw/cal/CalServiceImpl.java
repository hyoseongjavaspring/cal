package kr.hs.dgsw.cal;

import org.springframework.stereotype.Service;

@Service
public class CalServiceImpl implements CalService{

    @Override
    public String cal(String num1, String operator, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = 0;
        switch (operator){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "a":
                result = n1 / n2;
                break;
             default:
                 return "Unknown Error!";
        }
        return String.valueOf(result);
    }
}
