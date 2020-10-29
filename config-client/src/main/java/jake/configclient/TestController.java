package jake.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@RefreshScope
public class TestController {
    @Value("${version-number}")
    private String version;

    @GetMapping("/config")
    @ResponseBody
    public String config() {
        return version;
    }
}
