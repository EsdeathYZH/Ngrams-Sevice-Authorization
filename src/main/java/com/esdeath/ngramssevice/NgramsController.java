package com.esdeath.ngramssevice;


import org.springframework.web.bind.annotation.*;

@RestController
public class NgramsController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/randomwrite",method = RequestMethod.GET)
    public String random(@RequestParam("value_n") String value_n,@RequestParam("word_num") String word_num,
                         @RequestParam("filename") String filename){
        NgramsSeviceApplication.logger.info("Successfully generate texts!");
        int n = Integer.parseInt(value_n);
        int num = Integer.parseInt(word_num);
        return Ngrams.generateText(n,num,filename);
    }

}