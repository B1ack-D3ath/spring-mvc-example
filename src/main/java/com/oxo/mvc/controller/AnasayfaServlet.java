package com.oxo.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/anasayfa")
public class AnasayfaServlet {

    Logger logger = LoggerFactory.getLogger(AnasayfaServlet.class);

    @GetMapping("/sal")
    public ResponseEntity<?> sal(@RequestParam("isim") String isim) {

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\"" + isim + "\"")
                .body("yaragim");
    }

    @GetMapping("/files")
    public String dal(Model model){
        System.out.println("Cagri alindi");
        model.addAttribute("files","Cagri");
        return "files";
    }

    private String convertTime(Long timeAsLong) {
        Date time = new Date(timeAsLong);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return sdf.format(time);
    }
} // eof class
