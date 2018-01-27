package mafoe.springbootlightning_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/helloworld")
    public String helloWord() {
        return "Hello, World!";
    }
}
