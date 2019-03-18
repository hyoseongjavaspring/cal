package kr.hs.dgsw.cal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalService cs;

    @GetMapping("/cal/{num1}/{operator}/{num2}")
    public String cal(
            @PathVariable String num1,
            @PathVariable String operator,
            @PathVariable String num2
    ){
        return cs.cal(num1, operator, num2);
    }
}
