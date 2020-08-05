package jake.cloudview.controller;

import jake.cloudview.http.vo.Goods;
import jake.cloudview.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
        List<Goods> goodsList = goodsService.list().getBody().getRecords();
        model.addAttribute("goodsList", goodsList);
        return "goods";
    }
}
