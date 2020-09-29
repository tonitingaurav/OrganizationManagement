package com.tonitingaurav.microservice.exception;

public class AssetNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AssetNotFoundException(String message) {
		super(message);
	}

	public AssetNotFoundException(String message, Throwable e) {
		super(message, e);
	}

}
