package jake.cloudview.ribbon;

import jake.cloudview.http.response.BaseResponse;
import jake.cloudview.http.vo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Component
public class GoodsClientRibbon {
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 通过rest服务调用数据
     */
    public ResponseEntity<BaseResponse<Goods>> list() {
        return restTemplate.getForObject("http://CLOUD-SERVICE/goods/list", ResponseEntity.class);
    }

    /**
     * 测试rest服务
     */
    public String test() {
        return restTemplate.getForObject("http://CLOUD-SERVICE/goods/test", String.class);
    }

}
