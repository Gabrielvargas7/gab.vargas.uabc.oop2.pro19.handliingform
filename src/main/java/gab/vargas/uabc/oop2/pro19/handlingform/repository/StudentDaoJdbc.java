/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.lang.WordUtils;



/**
 *
 * @author gvargas
 */
public class StudentDaoJdbc implements StudentDao{

    
    
    private DataSource dataSource;

    public void setDataSource(DataSource ds) {
        dataSource = ds;
    }
    
    @Override
    public void addStudent(Student student) {
        
        Connection conn = null;
        try{
             conn = this.dataSource.getConnection();
             conn.setAutoCommit(false);
             String sqlStudent ="INSERT INTO student"
                    +"(firstname,lastname,phoneHome,phonemobile)"
                    +"VALUES"
                    +"(?,?,?,?)";
            PreparedStatement stmtStudent = conn.prepareStatement(sqlStudent);

            stmtStudent.setString(1,student.getFirstName().toLowerCase().trim());
            stmtStudent.setString(2,student.getLastName().toLowerCase().trim());
            stmtStudent.setString(3,student.getPhoneHome().toLowerCase().trim());
            stmtStudent.setString(4,student.getPhoneMobile().toLowerCase().trim());
            //execute the insert of the Student
            stmtStudent.executeUpdate();
            stmtStudent.close();
            conn.commit();
            conn.close();
        }catch(SQLException e)
        {
            if(conn != null)
            {
                try {
                   conn.rollback();
                }catch(SQLException e1){}
            }
        }finally
        {
            if (conn != null)
            {
                try{
                    conn.close();
                }catch(SQLException e){}
            }
        }
        
        
    }
    

    @Override
    public List<Student> getStudentList() {
        
        
         
         List<Student> studentList = new ArrayList<Student>();
         //String sql = "SELECT * FROM student";
         
         String sql = "SELECT "
                        + "studentid,"
                        + "CONCAT(UPPER(LEFT(firstname,1)), SUBSTRING(firstname, 2)) firstname,"
                        + "CONCAT(UPPER(LEFT(lastname,1)), SUBSTRING(lastname, 2)) lastname,"
                        + "phonehome,"
                        + "phonemobile "
                        + "FROM STUDENT";
         
         Connection conn = null;
         try{
             conn = this.dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet row = ps.executeQuery();
             
            while (row.next())
            {
             Student student = new Student();
             student.setStudentId(row.getInt("studentid"));
             student.setFirstName(WordUtils.capitalizeFully(row.getString("firstname")));
             student.setLastName(WordUtils.capitalizeFully(row.getString("lastname")));
             student.setPhoneHome(row.getString("phonehome"));
             student.setPhoneMobile(row.getString("phonemobile"));
             
             studentList.add(student);
            }
            row.close();
            ps.close();
        }catch(SQLException e)
        {
           throw new RuntimeException(e);
        }finally
        {
            if (conn != null)
            {
                try{
                    conn.close();
                }catch(SQLException e){}
            }
        }
        return studentList;
        
    }

    @Override
    public List<Student> removeStudent(int studentId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Student> findStudent(int studentId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
