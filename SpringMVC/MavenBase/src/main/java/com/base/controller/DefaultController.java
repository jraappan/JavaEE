
package com.base.controller;

import com.base.dao.TeacherDAO;
import com.base.models.Teachers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index(ModelMap map){
        // define attributes used in index.jsp
        map.addAttribute("name","Aku Ankka");
        return "index";
    } 
    @RequestMapping(value="/second", method=RequestMethod.GET)
    public String second(ModelMap map){
        Teachers s = new Teachers();
        s.setTName("Aku Ankka");
        s.setTSubject("Sarjakuvat");
        s.setEmail("aku@ankka.com");
        s.setPhone("1234567890");
        try{
            TeacherDAO.addTeacher(s);
        }catch(Exception e){
            e.printStackTrace();
        }
        return "second";
    } 
}
