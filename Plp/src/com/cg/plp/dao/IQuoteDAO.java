package com.cg.plp.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.cg.plp.bean.UserLoginBean;

public interface IQuoteDAO {

	public int checkValidLogin(UserLoginBean userLoginBean) throws SQLException, ClassNotFoundException, FileNotFoundException;
	
}
