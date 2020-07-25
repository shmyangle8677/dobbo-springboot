package home.xyl.dubbospringconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import home.xyl.HappyZoo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Zoocontroller {
    @Reference  //引用服务
    private HappyZoo happyZoo;

    @ResponseBody
    @RequestMapping("/visitZoo")
    public String visitZoo(){
        System.out.println("#########热部署完成");
        return happyZoo.zooInfo("hippopotamus");
    }

    @RequestMapping("/byj")
    public String byj(){
        System.out.println("毕业季");
        return "index";
    }

}
