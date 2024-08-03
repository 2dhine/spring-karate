package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("AccountId", "123");
        map.put("AccountName", "Durai");
        map.put("Email", "bb@gmail.com");
        return map;
    }

    @GetMapping("/aboutus")
    String about() {
        return " <h1>we are dev</h1>";
    }


}
