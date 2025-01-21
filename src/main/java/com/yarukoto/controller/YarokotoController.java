package com.yarukoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/yarukoto")
public class YarokotoController {
	
	@GetMapping("/{num}")
    @ResponseBody
    public String hello(@PathVariable Integer num) {
        return "おはようごっざいます"+num;
	}

// 結果"/yarukoto"にリクエストした場合
//"おはようごうがざいます"と出力される
	
	@GetMapping("/calendar")
    @ResponseBody
    public String calendar() {
        return "こんにちは";
	}
	
	 @GetMapping("/home")
	    @ResponseBody
	    public String home() {
	        return "こんばんは";
	}
	 
}
