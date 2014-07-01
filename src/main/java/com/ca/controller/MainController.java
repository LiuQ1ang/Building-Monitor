package com.ca.controller;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.ioc.provider.JsonIocProvider;

/**
 * @author liuzhilong<alexmaven@icloud.com>
 */
@Modules({ AcountController.class , DataController.class})
@IocBy(type = JsonIocProvider.class, args = { "nutz.js"})
@Encoding(input = "utf-8", output = "utf-8")
@Fail("jsp:/WEB-INF/err/500.jsp")
public class MainController {
}
