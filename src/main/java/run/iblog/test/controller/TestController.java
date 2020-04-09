package run.iblog.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/dev")
public class TestController {
    private String docs = "https://docs.iblog.run/";

    @RequestMapping("/iblog")
    public String show(ModelMap modelMap) {
        modelMap.addAttribute("intro", "An ultra lightweight blogging system based on springboot with the detailed docs : " + docs);
        return "index";
    }
}
