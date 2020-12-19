package com.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tank {

	public static void main(String[] args) throws InterruptedException{
		
		tankFrame tf=new tankFrame();
		while(true) {
			Thread.sleep(100);  //睡眠50毫秒
			tf.repaint();
		}
	}

}