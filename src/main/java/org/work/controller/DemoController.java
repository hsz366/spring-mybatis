package org.work.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.work.model.Users;
import org.work.service.DemoService;

import java.util.List;

@Controller
public class DemoController {


    @Autowired
    private DemoService demoService;


    //user.jsp

    @RequestMapping("go")
    public ModelAndView go(){
        List<Users> all = demoService.getAll();

        ModelAndView and = new ModelAndView();
        and.addObject("all",all);
        and.setViewName("user");
        System.out.println(all);
        return and;
    }

    @RequestMapping("login")
    @ResponseBody
    public String Login(){

        Users login = demoService.Login("2", "3");

        return login.toString();
    }
}
