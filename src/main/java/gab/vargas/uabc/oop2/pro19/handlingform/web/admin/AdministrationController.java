/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.web.admin;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Course;
import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import gab.vargas.uabc.oop2.pro19.handlingform.repository.CourseDao;
import gab.vargas.uabc.oop2.pro19.handlingform.repository.InitializeDataBaseDao;
import gab.vargas.uabc.oop2.pro19.handlingform.repository.StudentDao;
import gab.vargas.uabc.oop2.pro19.handlingform.services.initialize.InitializeCourseValues;
import gab.vargas.uabc.oop2.pro19.handlingform.services.initialize.InitializeStudentValues;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
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
@RequestMapping("/admin/*")
public class AdministrationController {

    private CourseDao  courseDao;
    private StudentDao studentDao;
    private InitializeDataBaseDao initializeDataBaseDao;    
    private InitializeStudentValues initializeStudentValues;
    private InitializeCourseValues initializeCourseValues;
    

    @Autowired
    public AdministrationController(CourseDao courseDao, StudentDao studentDao, InitializeDataBaseDao initializeDataBaseDao, InitializeStudentValues initializeStudentValues, InitializeCourseValues initializeCourseValues) {
        this.courseDao = courseDao;
        this.studentDao = studentDao;
        this.initializeDataBaseDao = initializeDataBaseDao;
        this.initializeStudentValues = initializeStudentValues;
        this.initializeCourseValues = initializeCourseValues;
    }
    

    
    
    
    @RequestMapping(value = {"administration"},method = RequestMethod.GET)
    public String InitializeDataBase(Model model){
        Date today = new Date();
        model.addAttribute("today",today);
        return "/admin/administration";
    }
    
    
    
    @RequestMapping(value = {"initializeDefaultValues"}, method = RequestMethod.GET)
    public String InitializeDefaultValues(Model model){
        
        
        initializeDataBaseDao.dropTables();
        initializeDataBaseDao.createTables();
        initializeDataBaseDao.insertDafaultData();
        
        
        List<Student> studentList = initializeStudentValues.getStudentList();
        for (Iterator it = studentList.iterator(); it.hasNext();) {
            Student student = (Student) it.next();
            studentDao.addStudent(student);
        }
        
        
        List<Course> courseList = initializeCourseValues.getCourseList();
        for (Iterator it = courseList.iterator(); it.hasNext();) {
            Course course = (Course) it.next();
            courseDao.addCourse(course);
        }
               
      return "pageSuccess";
    }
    
    
    
    
}
