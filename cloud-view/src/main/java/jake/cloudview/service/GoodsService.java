package jake.cloudview.service;

import jake.cloudview.http.response.BaseResponse;
import jake.cloudview.http.vo.Goods;
import jake.cloudview.ribbon.GoodsClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsClientRibbon goodsClientRibbon;

    public ResponseEntity<BaseResponse<Goods>> list() {
        return goodsClientRibbon.list();
    }
}
