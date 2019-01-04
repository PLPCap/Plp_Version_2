package com.cg.plp.service;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.dao.IQuoteDAO;
import com.cg.plp.dao.QuoteDAOImpl;

public class QuoteServiceImpl implements IQuoteService {

	IQuoteDAO iQuoteDAO=new QuoteDAOImpl();
	
	@Override
	public int checkValidLogin(UserLoginBean userLoginBean) throws ClassNotFoundException, FileNotFoundException, SQLException {
		
		
		
		//System.out.println("id"+userLoginBean.getLoginId());
		
		return iQuoteDAO.checkValidLogin(userLoginBean);
	}

	
	
}
