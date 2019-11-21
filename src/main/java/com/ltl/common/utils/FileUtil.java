package com.ltl.common.utils;


public class FileUtil {
	
	
	//给定一个文件名，返回该文件名的扩展名
	public static String getExtendName(String fileName){

		String[] split = fileName.split("\\.");
		return split[1];
	}
	

}
