package com.kdt.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticePingControlle {
    @GetMapping("/closed")
    public String closed(){
        return "closed";
    }
}
