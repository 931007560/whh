package com.ltl.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtil {

	//批量关闭流，参数能传入无限个
	public static void closeAll(InputStream src){
		try {
			src.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("关流出错");
		}
	}
	
	//传入一个文本文件对象，默认为UTF-8编码，返回该文件内容 要求方法内部调用上面第1个方法关闭流
	public static String readTextFile(InputStream src){
		InputStreamReader isr = new InputStreamReader(src);
		BufferedReader br = new BufferedReader(isr);
		String readLine=null;
		try {
			readLine = br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("读数据出错");
		}
		closeAll(src);
		return readLine;
	}
	
	//传入文本文件对象，返回该文件内容 并且要求内部调用上面第2个方法
	@SuppressWarnings("resource")
	public static String readTextFile(File txtFile) throws FileNotFoundException{
		FileInputStream fileInputStream = new FileInputStream(txtFile);
		String readTextFile = readTextFile(fileInputStream);
		return readTextFile;
	}
	
	
}
