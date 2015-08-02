package com.kyungtaelim.www.com.kyungtaelim.www.controller;

/**
 * Created by LKT on 2015-08-02.
 */

import com.kyungtaelim.www.com.kyungtaelim.www.dto.PhoneDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {

    @RequestMapping("/helloWorld")
    public ModelAndView helloWorld() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloWorld");
        mav.addObject("message", "Hello World");
        return mav;
    }
    @RequestMapping("/whoYouAre")
    public ModelAndView whoYouAre() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("whoYouAre");
        mav.addObject("message", "Hello World");
        mav.addObject("test", "This is kyungtaelim");
        return mav;
    }

    @RequestMapping(value = "/write", method = RequestMethod.GET)
    public String writeForm() {
        return "writeForm";
    }

    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String writeSubmit(PhoneDTO phoneDTO) {
        return "writeSubmit";
    }


/*
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String writeSubmit(PhoneDTO phoneDTO, @RequestParam String name, Model model) {

        System.out.println("this is hell~~~~~~~~~");
        System.out.println("this is hell~~~~~~~~~");
        System.out.println("this is hell~~~~~~~~~");
        System.out.println(phoneDTO.getName());
        System.out.println(phoneDTO.getName());
        System.out.println(phoneDTO.getName());
        System.out.println(name);
        model.addAttribute("naming", name);

        return "writeSubmit";
    }
*/

}