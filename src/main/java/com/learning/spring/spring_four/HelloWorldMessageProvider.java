package com.learning.spring.spring_four;

import com.learning.spring.spring_four._interface.MessageProvider;


public class HelloWorldMessageProvider implements MessageProvider
{

	public String getMessage() {
		return "Hello World - Spring Java Configuration !";
	}
    
}
