package jake.cloudservice.controller;

import jake.cloudservice.http.response.BaseResponse;
import jake.cloudservice.http.vo.Goods;
import jake.cloudservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/list")
    public ResponseEntity<BaseResponse<Goods>> list() {
        return goodsService.list();
    }

    @PostMapping("/buy")
    public ResponseEntity<BaseResponse> buy() {
        return new ResponseEntity<>(new BaseResponse(), HttpStatus.OK);
    }
}
