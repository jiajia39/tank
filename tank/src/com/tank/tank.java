package com.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Frame f=new Frame();  //farme类
//		f.setTitle("tank war");
//		f.setSize(600,500);
//		f.setResizable(false);
//		f.setVisible(true);
//		//window监听器
//		f.addWindowListener(new WindowAdapter(){//匿名类
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//                 System.exit(0);
//			}	
//		});
		
		tankFrame tf=new tankFrame();
	}

}