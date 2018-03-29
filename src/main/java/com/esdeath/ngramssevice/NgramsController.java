package com.esdeath.ngramssevice;


import org.springframework.web.bind.annotation.*;

@RestController
public class NgramsController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/randomwrite",method = RequestMethod.GET)
    public String random(String value_n, String word_num, String filename){
        int n = Integer.parseInt(value_n);
        int num = Integer.parseInt(word_num);
        return Ngrams.generateText(n,num,filename);
    }

}