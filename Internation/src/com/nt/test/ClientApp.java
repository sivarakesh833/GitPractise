package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TourPlan;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hiiiiiiiiiiii");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		Locale local=new Locale("_de", "_DE");
		String s1=context.getMessage("str1", null, "msg1", local.FRENCH);
		String s2=context.getMessage("str2", null, "msg2", local);
				String s3=context.getMessage("str3", null, "msg3", local);
						String s4=context.getMessage("str4", null, "msg4", local);
						
						JFrame frame=new JFrame();
						JButton button1=new JButton(s1);
						JButton button2=new JButton(s2);
						JButton button3=new JButton(s3);
						JButton button4=new JButton(s4);
						
						frame.setLayout(new FlowLayout());
						frame.add(button1);
						frame.add(button2);
						frame.add(button3);
						frame.add(button4);
						
						frame.pack();
						frame.setVisible(true);
	}
}
