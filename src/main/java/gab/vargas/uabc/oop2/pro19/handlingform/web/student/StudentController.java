/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.web.student;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import gab.vargas.uabc.oop2.pro19.handlingform.repository.StudentDao;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author gvargas
 */
@Controller
@RequestMapping("/student/*")
public class StudentController {

    
private String modelAndView;           
private StudentDao studentDao;

@Autowired
public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
}


    @RequestMapping(value ={"studentAdd","studentDelete","studentChange"}, method = RequestMethod.GET)    
    public String addDeleteChangeStudent(HttpServletRequest request){

        String value = request.getServletPath(); 
        modelAndView = value;           
       
        return modelAndView;
    }
    
    
    
    @RequestMapping(value = {"show","student"},method = RequestMethod.GET)
    public String showStudent(Model model){
    
        modelAndView = "/student/student";           
    
        Date today = new Date();
        model.addAttribute("today",today);
        model.addAttribute("studentList",studentDao.getStudentList());
        return modelAndView;
    }


        
    @RequestMapping(value = "deleteStudent", method = RequestMethod.POST)
    public String deleteStudent(
            //@RequestParam("operation") String operation,
            @RequestParam("studentId") String studentId,
            
            Model model) {
         
            modelAndView = "/student/student";           
        
        
//        if (operation.equals("delete"))
//        {
//            studentDao.removeStudent(studentId);
//            
//        }
//        if (operation.equals("change"))
//        {
//            
//        }
                
        
        model.addAttribute("studentList",studentDao.getStudentList());
        return modelAndView;
    }


       @RequestMapping(value = "add", method = RequestMethod.POST)
       public String addStudent(
            @RequestParam("firstName")   String firstName, 
            @RequestParam("lastName")    String lastName, 
            @RequestParam("phoneHome")   String phoneHome, 
            @RequestParam("phoneMobile") String phoneMobile, 
            Model model) {
        
        modelAndView = "/student/student";           
        
        Student student = new Student();
        
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPhoneHome(phoneHome);
        student.setPhoneMobile(phoneMobile);
        studentDao.addStudent(student);
      
        return "redirect:"+modelAndView;
    }

        
     
    

    
    
}
