package com.trunghoang.core.exceptions;

/**
 * 
 * This class custom exception
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 457543245352078531L;

	private String message;

	/**
	 * Constructor custom
	 */
	public ApplicationException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
