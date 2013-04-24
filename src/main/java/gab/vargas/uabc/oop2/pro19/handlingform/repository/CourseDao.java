/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Course;
import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import java.util.List;

/**
 *
 * @author GabrielVargas
 */
public interface CourseDao {
    
     public List<Course> getCourseList();
     public List<Course> removeCourse(int courseId);
     public List<Course> findCourse(int courseId);
     public void addCourse(Course course);
    
}
