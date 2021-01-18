package com.example.dm.exception;

import com.example.dm.enumT.ErrorCodeEnum;


/**
 * The MyBusinessException wraps all checked standard Java exception and enriches them with a custom error code.
 * You can use this code to retrieve localized error messages and to link to our online documentation.
 * 
 * @author TJanssen
 */
public class MyBusinessException extends Exception {

	private static final long serialVersionUID = 7718828512143293558L;
	
	private final ErrorCodeEnum code;
	private  Long reqId;
	public MyBusinessException(ErrorCodeEnum code) {
		super();
		this.code = code;

	}

	public MyBusinessException(String message, Throwable cause, ErrorCodeEnum code) {
		super(message, cause);
		this.code = code;
	}

	public MyBusinessException(String message, ErrorCodeEnum code) {
		super(message);
		this.code = code;
	}

	public MyBusinessException(Throwable cause, ErrorCodeEnum code) {
		super(cause);
		this.code = code;
	}

	public MyBusinessException(Long reqId, String message, ErrorCodeEnum code) {
		super(message);
		this.code = code;
		this.reqId = reqId;
	}

	public Long getReqId() {
		return reqId;
	}

	public void setReqId(Long reqId) {
		this.reqId = reqId;
	}

	public ErrorCodeEnum getCode() {
		return this.code;
	}
}