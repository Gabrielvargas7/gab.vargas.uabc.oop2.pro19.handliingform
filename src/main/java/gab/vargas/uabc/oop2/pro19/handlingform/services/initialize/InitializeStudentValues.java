/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.services.initialize;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gvargas
 */
public class InitializeStudentValues {
    
    private List studentList = new ArrayList<Student>();

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }
    
    
    public InitializeStudentValues() {
        
        Student student1 = new Student();
        
        student1.setFirstName("Juan");
        student1.setLastName("Perez");
        student1.setPhoneHome("510-555-5858");
        student1.setPhoneMobile("510-551-5151");
        
        
        Student student2 = new Student();
        
        student2.setFirstName("Pedro");
        student2.setLastName("Lopez");
        student2.setPhoneHome("510-665-5858");
        student2.setPhoneMobile("510-858-5151");
        
        Student student3 = new Student();
        
        student3.setFirstName("Jorge");
        student3.setLastName("Lu");
        student3.setPhoneHome("848-665-5258");
        student3.setPhoneMobile("848-852-5251");
        
        Student student4 = new Student();
        
        student4.setFirstName("Alejandro");
        student4.setLastName("Jimenez");
        student4.setPhoneHome("554-645-5858");
        student4.setPhoneMobile("554-845-5151");
        
       
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        
    }
    
    
    
    
}
