package com.hcl.boot.common;

import java.util.HashMap;
import java.util.Map;

public class ResponseData<T> implements java.io.Serializable {

	private static final long serialVersionUID = 4563841876874219154L;

	private int status = 200 ;

	private T result;

	private String message;

	private int code;
	
	private Map<Object, Object> attach = new HashMap<>() ;
	
	public T getResult() {
		return result;
	}

	
	@Deprecated
	public void setResult(T result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	

	public ResponseData<T> error(String message) {
		this.status = 500;
		this.message = message;
		return this;
	}

	public ResponseData<T> ok() {
		this.status = 200;
		return this;
	}
	
	public ResponseData<T> ok(T t) {
		this.result = t;
		this.status = 200;
		return this;
	}
	
	public ResponseData<T> warn(String message) {
		this.status = 300;
		this.message = message;
		return this;
	}
	
	public ResponseData<T> warn(T t, String message) {
		this.result = t;
		this.status = 300;
		this.message = message;
		return this;
	}

	/**
	 * 调用是否成功
	 * 
	 * @return
	 */
	public boolean isOK() {
		return status == 200;
	}
	
	/**
	 * 是否警告
	 * 
	 * @return
	 */
	public boolean isWarn() {
		return status == 300;
	}

	public int getStatus() {
		return status;
	}


	public void addAttach(Object k, Object v) {
		if(attach==null) attach = new HashMap<>() ;
		attach.put(k, v) ;
	}
	
	
	@SuppressWarnings("unchecked")
	public <V> V getAttach(Object k) {
		return (V) (attach == null ? null : attach.get(k)) ;
	}
	

	@Override
	public String toString() {
		return "ApiResult [status=" + status + ", result=" + result + ", message=" + message + ", code=" + code + ", attach=" + attach + "]";
	}
	
	
	/**
	 * 不推荐使用, 设置状态请使用ok、error接口, 它存在是为了序列化
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * 不推荐使用, 设置结果请使用error接口, 它存在是为了序列化
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/** 不要使用这个方法, 它存在是为了序列化 */
	@Deprecated
	public Map<Object, Object> getAttach() {
		return attach;
	}
	
	/** 不要使用这个方法, 它存在是为了序列化 */
	@Deprecated
	public void setAttach(Map<Object, Object> attach) {
		this.attach = attach;
	}
	
}
