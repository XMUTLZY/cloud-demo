package jake.cloudview.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CLOUD-SERVICE2")
public interface Service2Feign {
    @GetMapping("/test")
    String test2();
}
