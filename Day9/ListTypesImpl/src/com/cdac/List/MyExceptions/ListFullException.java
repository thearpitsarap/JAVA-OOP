package com.cdac.List.MyExceptions;

import java.lang.RuntimeException;

public class ListFullException extends RuntimeException{
	
	public ListFullException(String str) {
		super(str);
	}
}