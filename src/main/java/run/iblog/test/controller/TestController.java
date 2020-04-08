package run.iblog.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping("/iblog")
    public String show(ModelMap modelMap) {
        modelMap.addAttribute("intro", "An ultra lightweight blogging system based on springboot with the detailed docs : https://docs.iblog.run/");
        return "index";
    }
}