package com.dw.common.pojo;

import java.io.Serializable;

public class DwResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Object data;
	private Integer code;
	private String msg;
	
	public DwResult() {
		
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public DwResult(Object data, Integer code, String msg) {
		this.data = data;
		this.code = code;
		this.msg = msg;
	}
	
	
	public DwResult(Object data){
		this.code = 200;
		this.msg = "操作成功";
		this.data = data;
	}
	
	public static DwResult ok(){
		return new DwResult(null);
	}
	
	public static DwResult ok(Object data){
		return new DwResult(data);
	}
	
	public static DwResult build(Integer code,String msg){
		return new DwResult(null, code,msg );
	}
	
	public static DwResult build(Integer code,String msg,Object data){
		return new DwResult(data, code, msg);
	}
	
	public boolean isOk(){
		return this.code == 200;
	}

}
