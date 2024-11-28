package com.oxo.mvc.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gr")
public class Example_01 {

    @GetMapping("/giris")
    public String giris(@RequestParam(name = "sayi") Integer sayi, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Gelen sayı değeri= " + sayi);
        return "anasayfa";
    }
}