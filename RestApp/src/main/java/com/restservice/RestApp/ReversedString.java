package com.restservice.RestApp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReversedString {

    @RequestMapping("reverse/{s}")
    public String reverse(@PathVariable String s){
        String reversed = "";
        for(int i=s.length()-1; i>=0; i--)
            reversed += s.charAt(i);
        return reversed;
    }
}
