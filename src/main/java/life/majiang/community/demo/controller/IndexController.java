package life.majiang.community.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller   //允许这个类去接收前端的一个请求
public class IndexController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name") String name,Model model){
        model.addAttribute("name",name);//给model赋值
        return "index";//然后我们在模板目录里面创建一个hello的html文件
    }
}
