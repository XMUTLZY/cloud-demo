package jake.cloudservice.service;

import jake.cloudservice.http.response.BaseResponse;
import jake.cloudservice.http.vo.Goods;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Service
public class GoodsService {
    public static final int LIMIT_NUM = 5;

    public ResponseEntity<BaseResponse<Goods>> list() {
        BaseResponse response = new BaseResponse();
        List<Goods> goodsList = new ArrayList<>();
        for (int i = 0; i<LIMIT_NUM; i++) {
            Goods goods = new Goods(i + 1, "商品名称" + i, "描述" + i, LocalDateTime.now(), i*100);
            goodsList.add(goods);
        }
        response.setRecords(goodsList);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
