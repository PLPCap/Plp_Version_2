package com.cg.plp.service;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.cg.plp.bean.UserLoginBean;

public interface IQuoteService {

	public int checkValidLogin(UserLoginBean userLoginBean) throws SQLException, ClassNotFoundException, FileNotFoundException;
	
}
