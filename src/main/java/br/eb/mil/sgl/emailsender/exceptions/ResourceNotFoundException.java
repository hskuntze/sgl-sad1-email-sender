package br.eb.mil.sgl.emailsender.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1317428981842061558L;

	public ResourceNotFoundException() {
	}
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	public ResourceNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
