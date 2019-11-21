package com.ltl.common.utils;

import java.util.Date;

public class DateUtil {
	
	//给一个时间对象，返回该时间所在月的1日0时0分0秒
	public static Date getDateByInitMonth(Date src){
		src.setHours(0);
		src.setMinutes(0);
		src.setSeconds(0);
		src.setDate(1);
		return src;
	}
	
	//给任意一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况
	public static Date getDateByFullMonth(Date src){

	
	return src;
	}
	
	
	
}
