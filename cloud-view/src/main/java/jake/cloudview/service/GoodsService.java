package jake.cloudview.service;

import jake.cloudview.feign.GoodsClientFeign;
import jake.cloudview.http.response.BaseResponse;
import jake.cloudview.http.vo.Goods;
import jake.cloudview.ribbon.GoodsClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsClientRibbon goodsClientRibbon;
    @Autowired
    private GoodsClientFeign goodsClientFeign;

    public BaseResponse<Goods> list() {
//        return goodsClientRibbon.list();
        return goodsClientFeign.list();
    }

    public String test() {
        return goodsClientRibbon.test();
    }
}
