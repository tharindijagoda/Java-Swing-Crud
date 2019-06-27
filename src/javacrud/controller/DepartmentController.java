/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javacrud.DB.DBConnection;
import javacrud.DB.DBHandler;
import javacrud.model.Department;

/**
 *
 * @author tharindi
 */
public class DepartmentController {
    public static int addDepartment(Department department) throws ClassNotFoundException,SQLException{
        String sql = "Insert Into Department Values (?,?)";
	Object [] values = {department.getDepId(),department.getDepName()};
	int resultSet = DBHandler.setData(DBConnection.getConnection(),sql,values);
	return resultSet;
    }
    
    
    public static int updateDepartment(Department department) throws ClassNotFoundException, SQLException {
        String sql = "Update Department Set name='"+department.getDepName()+"'"+"Where ID='"+department.getDepId()+"'";
	int resultSet = DBHandler.setData(DBConnection.getConnection(),sql);
	return resultSet;
    }
    
    public static int deleteCustomer(Department department) throws ClassNotFoundException, SQLException {
        String sql = "Delete from Department where ID ='"+department+"'";
        int resultset = DBHandler.setData(DBConnection.getConnection(),sql);
        return resultset;       
    }
    
    public static ArrayList<Department> viewAllCustomer() throws ClassNotFoundException, SQLException {
        String sql="Select * From Department";
	ResultSet resultSet=DBHandler.getData(DBConnection.getConnection(), sql);
        ArrayList<Department> departments=new ArrayList<Department>();
        while(resultSet.next()){
            Department department=new Department(resultSet.getString(1),resultSet.getString(2));
            departments.add(department);
	}
	return departments;
    }


}
