package com.ruoyi.web.controller.forum;

import com.ruoyi.common.core.controller.BaseController;
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
@RequestMapping("/forum/article")
public class ArticleController extends BaseController {
    private String prefix = "forum";

    @RequiresPermissions("forum:article:view")
    @GetMapping()
    public String article() {
        return prefix + "/article";
    }
}
