package com.amsidh.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.amsidh.dao.CircleDao;
import com.amsidh.model.Circle;
@Component
public class CircleDaoImpl implements CircleDao {

	@Override
	public Circle getCircle(int circleId) {
		
		Connection con=null;
		try
		{
		Class.forName("org.apache.derby.jdbc.ClientDriver");
		con=DriverManager.getConnection("jdbc:derby://localhost:1527/MyDB;create=true");
		PreparedStatement pst=con.prepareStatement("SELECT * FROM CIRCLE WHERE ID=?");
		pst.setInt(1, circleId);
		ResultSet rst=pst.executeQuery();
		Circle circle=null;
		while(rst.next())
		{
			circle=new Circle(circleId,rst.getString(2));
			return circle; 	
			
		}
        rst.close();
		pst.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally{
			
			try
			{
				con.close();
			}catch(SQLException sqlEx)
			{
				sqlEx.printStackTrace();
			}
		}
		return null;
		
		
	}
   
}
