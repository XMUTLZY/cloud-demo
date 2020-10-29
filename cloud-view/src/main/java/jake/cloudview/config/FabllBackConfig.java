package jake.cloudview.config;

import jake.cloudview.feign.GoodsClientFeign;
import jake.cloudview.http.response.BaseResponse;
import jake.cloudview.http.vo.Goods;
import org.springframework.stereotype.Component;

@Component
public class FabllBackConfig implements GoodsClientFeign {
    @Override
    public BaseResponse<Goods> list() {
        BaseResponse response = new BaseResponse();
        response.setMessage("error");
        return response;
    }
}
