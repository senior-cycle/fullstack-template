package com.example.backend;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "你好，这是我第一个接口";
    }

    @GetMapping("/total")
    public String total(@RequestParam int fund) {
        FundProvided fp = new FundProvided();
        float frozen = fp.Frozen(fund);
        return "申请金额：" + fund + "，冻结后：" + frozen;
    }
}