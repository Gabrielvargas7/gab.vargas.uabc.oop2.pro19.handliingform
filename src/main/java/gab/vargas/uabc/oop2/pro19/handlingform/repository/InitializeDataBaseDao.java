/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro19.handlingform.repository;

/**
 *
 * @author GabrielVargas
 */
public interface InitializeDataBaseDao {
    
     public void createTables();
     public void dropTables();
     public void insertDafaultData();
    
}
