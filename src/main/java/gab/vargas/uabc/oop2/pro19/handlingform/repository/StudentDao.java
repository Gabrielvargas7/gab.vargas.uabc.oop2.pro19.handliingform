/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import java.util.List;

/**
 *
 * @author gvargas
 */
public interface StudentDao {
    
     public List<Student> getStudentList();
     public List<Student> removeStudent(int studentId);
     public List<Student> findStudent(int studentId);
     public void addStudent(Student student);
   
    }
