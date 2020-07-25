package home.xyl.dubbospringprovider.serviceImp;

import com.alibaba.dubbo.config.annotation.Service;
import home.xyl.HappyZoo;
import org.springframework.stereotype.Component;

@Service    //暴露服务
@Component
public class HappZooImp implements HappyZoo {
    @Override
    public String zooInfo(String a) {
        return "I find a "+a+" !";
    }
}
