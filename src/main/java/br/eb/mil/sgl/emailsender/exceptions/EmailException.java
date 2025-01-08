package br.eb.mil.sgl.emailsender.exceptions;

public class EmailException extends RuntimeException {
	private static final long serialVersionUID = -6163267649593454326L;

	public EmailException() {
	}
	
	public EmailException(String msg) {
		super(msg);
	}
	
	public EmailException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
