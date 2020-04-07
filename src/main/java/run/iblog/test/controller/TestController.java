package run.iblog.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/iblog")
    public String show() {
        return "An ultra lightweight blogging system based on springboot : iblog.run and the docs is docs.iblog.run (enable continuous integration and deployment with azure devops)";
    }
}
