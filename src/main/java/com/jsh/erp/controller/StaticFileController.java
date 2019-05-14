package com.jsh.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginController.java
 * Description: 登录controller
 *
 * @author Peng Shiquan
 * @date 2019-05-08
 */

@Controller
public class StaticFileController {
    /**
     * Description: 登录方法
     *
     * @param
     * @return java.lang.String
     * @Author: Peng Shiquan
     * @Date: 2019-05-08
     */
    @RequestMapping("login")
    public String goHome() {
        return "login";
    }

    @RequestMapping("index")
    public String goIndex() {
        return "index";
    }
}
