/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacrud.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tharindi
 */
public class DBHandler {
    
    public static int setData(Connection conn,String sql) throws SQLException{

        Statement stm = conn.createStatement();

	int res = stm.executeUpdate(sql);

	return res;

     }

    public static ResultSet getData(Connection conn,String sql) throws SQLException{

	Statement stm = conn.createStatement();

	ResultSet rst = stm.executeQuery(sql);

	return rst;

    }

    public static int setData(Connection conn,String sql,Object[] values)throws SQLException{

	PreparedStatement pstm = conn.prepareStatement(sql);

	for(int i = 0 ; i < values.length ; i++){

            pstm.setObject(i+1,values[i]);
        }

	int res = pstm.executeUpdate();

	return res;
    }

    public static ResultSet getData(Connection conn,String sql,Object[] values) throws SQLException{

	PreparedStatement pstm = conn.prepareStatement(sql);

	for(int i = 0 ; i < values.length ; i++){

            pstm.setObject(i+1,values[i]);

        }

        ResultSet rst = pstm.executeQuery();

	return rst;

    }
}
