package com.williamssf.cursomc.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String name, String message) {
		super();
		this.fieldName = name;
		this.message = message;
	}

	public String getName() {
		return fieldName;
	}

	public void setName(String name) {
		this.fieldName = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
