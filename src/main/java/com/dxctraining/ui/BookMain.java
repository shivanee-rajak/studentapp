package com.dxctraining.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dxctraining.JavaConfig;

public class BookMain {

	 public static void main(String[] args) {
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.register(JavaConfig.class);
	        context.refresh();

	    }

}
