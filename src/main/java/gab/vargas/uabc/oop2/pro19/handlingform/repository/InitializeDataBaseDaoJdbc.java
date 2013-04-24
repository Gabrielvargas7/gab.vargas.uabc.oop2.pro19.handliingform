/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author GabrielVargas
 */
public class InitializeDataBaseDaoJdbc implements InitializeDataBaseDao{
    
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    
    public void createTables()
    {

        Connection conn = null;
         try{
             conn = dataSource.getConnection();
             conn.setAutoCommit(false);

             String sqlStudent ="CREATE TABLE student("
                    +"studentid INTEGER NOT NULL AUTO_INCREMENT,"
                    +"firstname VARCHAR(30),"
                    +"lastname  VARCHAR(30),"
                    +"phonehome  VARCHAR(20),"
                    +"phonemobile  VARCHAR(20),"
                    +"PRIMARY KEY(Studentid));";
                   

             PreparedStatement psStudent = conn.prepareStatement(sqlStudent);
             psStudent.executeUpdate();
             psStudent.close();

             String sqlCourse ="CREATE TABLE course("
                    +"courseId INTEGER NOT NULL AUTO_INCREMENT,"
                    +"coursename VARCHAR(30),"
                    +"coursecode VARCHAR(30),"
                    +"PRIMARY KEY(courseid));";
                   
             PreparedStatement psCourse = conn.prepareStatement(sqlCourse);
             psCourse.executeUpdate();
             psCourse.close();


             
             conn.commit();

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

    }

    
    public void dropTables()
    {

          Connection conn = null;
         try{
             conn = dataSource.getConnection();
             conn.setAutoCommit(false);

             String sqlStudent ="DROP TABLE student";
             PreparedStatement psStudent = conn. prepareStatement(sqlStudent);
             psStudent.executeUpdate();
             psStudent.close();

             String sqlCourse ="DROP TABLE course";
             PreparedStatement psCourse = conn.prepareStatement(sqlCourse);
             psCourse.executeUpdate();
             psCourse.close();
             conn.commit();

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

    }

    
     public void insertDafaultData()
    {

        Connection conn = null;
         try{
             conn = dataSource.getConnection();
             conn.setAutoCommit(false);

             String sqlStudent ="INSERT INTO student "
                    +"(firstname,lastname,phonehome,phonemobile)"
                    +"VALUES"
                    +"('gabriel','vargas','5103939921','5103939121'),"
                    +"('patricia','padilla','5107788181','5102229121'),"
                    +"('mike','almada','5101239921','5103459121'),"
                    +"('maria','ramirez','5109849921','5107779121')";

             PreparedStatement psStudent = conn.prepareStatement(sqlStudent);
             psStudent.executeUpdate();
             psStudent.close();

             String sqlCourse ="INSERT INTO course"
                    +"(coursename,coursecode)"
                    +"VALUES"
                    +"('java 1','JAV1'),"
                    +"('math 300','MAT300'),"
                    +"('calculo  2','CAL2'),"
                    +"('geografia 56','GEO56')";

             PreparedStatement psCourse = conn.prepareStatement(sqlCourse);
             psCourse.executeUpdate();
             psCourse.close();
             conn.commit();

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


    }

    
}
