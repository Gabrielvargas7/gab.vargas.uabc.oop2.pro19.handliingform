/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.web.course;

import gab.vargas.uabc.oop2.pro19.handlingform.repository.CourseDao;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author gvargas
 */
@Controller
@RequestMapping("/course/*")
public class CourseController {
    
    private CourseDao courseDao;

    @Autowired
    public CourseController(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    
    @RequestMapping(value = {"course","show"},method = RequestMethod.GET)
    public String InitializeDataBase(Model model){
        Date today = new Date();
        model.addAttribute("today",today);
        model.addAttribute("courseList",courseDao.getCourseList());
        return "/course/course";
    }
    
    
}
