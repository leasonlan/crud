package com.example.crud.dto;

 
/**
 * 操作信息响应类
 */
public class Rsp {
	public static String REP_CODE = "code";
	public static String REP_MSG = "message";
	public static String REP_DATA = "data";

	public static String REP_CODE_SUCC = "200";
	public static String REP_CODE_FAIL = "300";
	public static String REP_MSG_FAIL = "失败";
	public static String REP_MSG_SUCC = "成功";
	
	public static Result succ(String msg , Object obj){
		Result  result = new Result();
		result.setCode(REP_CODE_SUCC);
		msg = msg==null|| "".equals(msg)?REP_MSG_SUCC:msg;
		result.setMessage("请求成功!");
		result.setDetailMessage(msg);
		result.setData(obj);
		return result;
	}
	
	public static Result fail(String msg ,Object obj){
		Result  result = new Result();
		result.setCode(REP_CODE_FAIL);
		msg = msg==null|| "".equals(msg)?REP_MSG_SUCC:msg;
		result.setMessage("请求失败!");
		result.setDetailMessage(msg);
		result.setData(obj);
		return result;
	}

	public static Result send(String code,String msg , Object obj){
		Result  result = new Result();
		result.setCode(code);
		msg = msg==null|| "".equals(msg)?REP_MSG_SUCC:msg;
		result.setMessage(msg);
		result.setDetailMessage(msg);
		result.setData(obj);
		return result;
	}
}
