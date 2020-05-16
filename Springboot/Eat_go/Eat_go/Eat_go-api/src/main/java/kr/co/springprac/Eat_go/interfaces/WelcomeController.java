package kr.co.springprac.Eat_go.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/") // http에 접속했을 때 나오도록
    //EatGoApplication.java를 run 했을 때 8080 port를 이용한다고 나옴 -> localhost:8080에 접속하면 Hello World가 출력
    public String hello() {
        return "Hello, World!!";
    }

}
