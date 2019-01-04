package com.cg.plp.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.util.DBConnection;

public class QuoteDAOImpl implements IQuoteDAO {

	
	
	
	@Override
	public int checkValidLogin(UserLoginBean userLoginBean) throws SQLException, ClassNotFoundException, FileNotFoundException {
		
		{
			Connection connection=DBConnection.getConnection();
					int role=0;
					
					PreparedStatement preparedStatement=null;
					ResultSet resultset1 = null;
					
					
					    preparedStatement=connection.prepareStatement("select role_code from Login_credentials where user_name=? and password=?");
						preparedStatement.setString(1,userLoginBean.getLoginId());
						preparedStatement.setString(2, userLoginBean.getPassword());
						resultset1=preparedStatement.executeQuery();
						while(resultset1.next())
						{
							role=resultset1.getInt(1);
							
						}
						
						

			return role;				
		}
		//return 1;
	}

}
