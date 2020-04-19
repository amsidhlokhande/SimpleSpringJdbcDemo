package com.amsidh.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.dao.CircleDao;
import com.amsidh.dao.impl.CircleDaoImpl;
import com.amsidh.model.Circle;

public class MainApp {
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
	CircleDao circleDao=context.getBean("circleDaoImpl",CircleDao.class);
	Circle circle=circleDao.getCircle(1);
	System.out.println(circle.getName());
}
}
