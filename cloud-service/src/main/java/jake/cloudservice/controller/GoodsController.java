package jake.cloudservice.controller;

import jake.cloudservice.http.response.BaseResponse;
import jake.cloudservice.http.vo.Goods;
import jake.cloudservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<Goods> list() {
        return goodsService.list();
    }

    @PostMapping("/buy")
    public ResponseEntity<BaseResponse> buy() {
        return new ResponseEntity<>(new BaseResponse(), HttpStatus.OK);
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "hahaha";
    }
}
