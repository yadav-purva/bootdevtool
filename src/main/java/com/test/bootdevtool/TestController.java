package com.test.bootdevtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@ResponseBody
public class TestController {
    public String  test(){
        int a=10;
        int b=30;
        return "sum of a and b is:"+(a+b);
    }
}
