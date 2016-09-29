package com.love2code.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.love2code.hibernate.demo.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create session factory
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	//create session
		Session session=factory.getCurrentSession();
		try{
			//use the session object to save java object
			
			//create a student object
			System.out.println("creating new student object");
			Student tempStudent=new Student("pual","wall","harsha@faf.com");
			
			//start transcation
			session.beginTransaction();
			// save the student object
			
			System.out.println("saving student");
			session.save(tempStudent);
			//commit transcation
			
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
		}
	}

}
