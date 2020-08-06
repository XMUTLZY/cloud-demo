package jake.cloudview.controller;

import jake.cloudview.http.vo.Goods;
import jake.cloudview.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by Jake.lin on 2020/08/03
 */
@Controller
public class GoodsViewController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goods")
    public Object goods(Model model) {
        List<Goods> goodsList = goodsService.list().getRecords();
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return goodsService.test();
    }
}
