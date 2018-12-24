package com.zoop.controller;


import com.zoop.bean.Person;
import com.zoop.service.ApplicationBootTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApplicationBootTestContoller {


    private ApplicationBootTestService as;

//    public ApplicationBootTestContoller(ApplicationBootTestService as) {
//        this.as = as;
//    }


    private Person  person;

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @Autowired
    public void setAs(ApplicationBootTestService as) {
        this.as = as;
    }

    @ResponseBody
    @RequestMapping("/helloBoot")
    public String helloBoot() {
        as.printData();
        System.out.println("test--------------------"+person);
        return "你好!";
    }


    @ResponseBody
    @RequestMapping("/jsonPerson")
    public  Person  jsonPerson(){
        return  person;
    }


}
