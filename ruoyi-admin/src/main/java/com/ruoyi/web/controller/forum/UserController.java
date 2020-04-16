package com.ruoyi.web.controller.forum;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lichuangbo
 * @version 1.0
 * @created 2020/4/15
 */
@Controller
@RequestMapping("/forum/user")
public class UserController {
    private String prefix = "forum";

    @RequiresPermissions("forum:user:view")
    @GetMapping()
    public String user() {
        return prefix + "/user";
    }
}
