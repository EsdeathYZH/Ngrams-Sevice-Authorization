package com.esdeath.ngramssevice;


import com.esdeath.ngramssevice.service.Ngrams;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class NgramsController {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("main");
        return model;
    }

    @RequestMapping(value = "/randomwrite",method = RequestMethod.GET)
    public ModelAndView random(@RequestParam("value_n") String value_n,@RequestParam("word_num") String word_num,
                         @RequestParam("filename") String filename){
        //NgramsSeviceApplication.logger.info("Successfully generate texts!");
        ModelAndView model = new ModelAndView("result");
        int n = Integer.parseInt(value_n);
        int num = Integer.parseInt(word_num);
        model.addObject("content",Ngrams.generateText(n,num,filename));
        return model;
    }

    @RequestMapping(value = "/write",method = RequestMethod.GET)
    public ModelAndView write(){
        ModelAndView model = new ModelAndView("write");
        return model;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView model = new ModelAndView("login");
        return model;
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView model = new ModelAndView("register");
        return model;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String registerResult(String username,String password){
        return username+password;
    }

}