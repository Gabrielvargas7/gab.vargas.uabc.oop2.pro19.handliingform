/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.services.initialize;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GabrielVargas
 */
public class InitializeCourseValues {
    
    private List courseList = new ArrayList<Course>();

    public List getCourseList() {
        return courseList;
    }

    public void setCourseList(List courseList) {
        this.courseList = courseList;
    }
    
    
    public InitializeCourseValues() {
        
        Course course1 = new Course();
        course1.setCourseName("Historia 2");
        course1.setCourseCode("HIS2");
        
        Course course2 = new Course();
        course2.setCourseName("Contabilidad 1");
        course2.setCourseCode("CON2");
        
        Course course3 = new Course();
        course3.setCourseName("Digitales 1");
        course3.setCourseCode("DIG1");
        
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        
    }
    
    
}
