package com.example.backend;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class FundController {

    // 关键：写在类里，不在方法里
    private final Map<String, Application> store = new LinkedHashMap<>();
    private int seq = 0;

    @GetMapping("/apply")
    public String apply(@RequestParam int fund) {
        seq++;

        Application app = new Application();
        app.id = "A" + seq;
        app.fund = fund;
        app.status = "待审批";

        store.put(app.id, app);
        return "申请成功，单号：" + app.id;
    }
    @GetMapping("/approve")
    public String approve(@RequestParam String id) {
        Application app = store.get(id);
        if (app == null) return "没这个单号：" + id;
        app.status = "已批准";
        return id + " 已批准";
    }
    @GetMapping("/status")
    public String status(@RequestParam String id) {
        Application app = store.get(id);
        if (app == null) return "没这个单号：" + id;
        return "单号 " + app.id + "，金额 " + app.fund + "，状态：" + app.status;
    }
    @GetMapping("/reject")
    public String reject(@RequestParam String id) {
        Application app = store.get(id);
        if (app == null) return "没这个单号：" + id;
        app.status = "已驳回";
        return id + " 已驳回";
    }

    @GetMapping("/all")
    public Collection<Application> all() {
        return store.values();
    }
}