package jake.cloudview.feign;

import jake.cloudview.config.FabllBackConfig;
import jake.cloudview.http.response.BaseResponse;
import jake.cloudview.http.vo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jake.lin on 2020/08/06
 */
@FeignClient(value = "CLOUD-SERVICE", fallback = FabllBackConfig.class)
public interface GoodsClientFeign {
    @GetMapping("/goods/list")
    BaseResponse<Goods> list();
}
