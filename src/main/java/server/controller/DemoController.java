package server.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return "你好阿测试控制器";
    }
} 