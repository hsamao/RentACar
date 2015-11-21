package com.samao.rentacar.web;

import com.samao.rentacar.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hsamao on 11/20/15.
 */

@Controller
public class MainController {

    @Autowired
    private MainService mainService;


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main (){

        mainService.rent();
        return "main";
    }

    @RequestMapping (value = "/second", method = RequestMethod.GET)
    public String second(){
        return "second";
    }
}
