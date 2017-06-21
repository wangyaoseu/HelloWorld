package controllers; /**
 * Created by wangyao on 2017/6/21.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        //return "WEB-INF/views/home.jsp";
        return "home";
    }
}