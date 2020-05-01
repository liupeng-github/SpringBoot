package cloud.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liupeng
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("message", "SpringBoot整合Freemarker");
        return "index";
    }
}
