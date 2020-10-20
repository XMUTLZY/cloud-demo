package jake.cloudservice2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "hello world";
    }
}
