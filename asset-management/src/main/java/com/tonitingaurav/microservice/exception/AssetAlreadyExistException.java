package com.tonitingaurav.microservice.exception;

public class AssetAlreadyExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AssetAlreadyExistException(String message) {
		super(message);
	}

	public AssetAlreadyExistException(String message, Throwable e) {
		super(message, e);
	}

}
