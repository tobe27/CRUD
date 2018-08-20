package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;

@Controller
@RequestMapping
public class LoginController {
    private Logger logger = Logger.getLogger(LoginController.class);
    /**
     * @RequestMapping (value = "/addSupplier",method = RequestMethod.POST)
     *     public ModelAndView add(@Validated Supplier supplier)
     *
     *
     */
    /**
     * Login登录成功/失败界面
     * RequestMapping 用来映射一个请求和请求的方法
     * value="/success" 表示请求由success方法进行处理
     */
    @RequestMapping(value = "/success",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        logger.info("controller:开始执行登录操作...");
        // 在 model 中添加一个名为 "user" 的 user 对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        ModelAndView mav = new ModelAndView();
        if (true/*"jnshu".equals(username) && "123456".equals(password)*/) {
            mav.addObject(user);
            logger.info("login:登录成功！user:"+username);
            return mav;
        } else {
            mav.setViewName("fail");
            logger.info("login:登录失败！");
            return mav;
        }
    }

}
