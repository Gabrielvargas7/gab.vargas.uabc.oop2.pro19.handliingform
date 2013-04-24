/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.web;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author gvargas
 */
@Controller
@RequestMapping("/index")
public class indexController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String indext(Model model){
        Date today = new Date();
        model.addAttribute("today",today);
        return "index";
    }
    
    
    
}
