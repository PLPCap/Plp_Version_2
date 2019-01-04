package com.cg.plp.ui;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.plp.bean.UserLoginBean;
import com.cg.plp.service.IQuoteService;
import com.cg.plp.service.QuoteServiceImpl;

public class QuoteMain {

	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException
	
	
	{
		System.out.println("*******************Welcome To Online Insurance Quote Generation****************");
		System.out.println("Login Id:");
		String id=sc.next();
		System.out.println("Password:");
		String pass=sc.next();
		//System.out.print("1.user\t 2.Agent\t 3.Admin");
		UserLoginBean userLoginBean=new UserLoginBean();
		userLoginBean.setLoginId(id);
		userLoginBean.setPassword(pass);
		
		IQuoteService iQuoteService=new QuoteServiceImpl();
		
		int role_code=iQuoteService.checkValidLogin(userLoginBean);
		System.out.println(role_code);
		
		
		
	}

}
