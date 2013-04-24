/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

import gab.vargas.uabc.oop2.pro19.handlingform.domain.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.apache.commons.lang.WordUtils;

/**
 *
 * @author GabrielVargas
 */
public class CourseDaoJdbc implements CourseDao{

    private DataSource dataSource;

    
    public void setDataSource(DataSource ds) {
        dataSource = ds;
    }

    
    @Override
    public List<Course> getCourseList() {
        
         List<Course> courseList = new ArrayList<Course>();
         String sql = "SELECT * FROM course";
         
         Connection conn = null;
         try{
             conn = this.dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet row = ps.executeQuery();
             
            while (row.next())
            {
                Course course = new Course();
                course.setCourseId(row.getInt("courseid"));
                course.setCourseName(WordUtils.capitalizeFully(row.getString("coursename")));
                course.setCourseCode(row.getString("coursecode"));
                courseList.add(course);
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
        return courseList;

        
    }

    @Override
    public List<Course> removeCourse(int courseId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Course> findCourse(int courseId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addCourse(Course course) {
        
        Connection conn = null;
        try{
             conn = this.dataSource.getConnection();
             conn.setAutoCommit(false);
             String sqlCourse ="INSERT INTO course"
                    +"(coursename,coursecode)"
                    +"VALUES"
                    +"(?,?)";
            PreparedStatement stmtCourse = conn.prepareStatement(sqlCourse);

            stmtCourse.setString(1,course.getCourseName().toLowerCase().trim());
            stmtCourse.setString(2,course.getCourseCode().toUpperCase().trim());
            
            //execute the insert of the Student
            stmtCourse.executeUpdate();
            stmtCourse.close();
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


    
    
    
}
