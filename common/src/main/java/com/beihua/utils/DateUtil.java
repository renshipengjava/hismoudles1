package com.beihua.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
 
	   public static Date string2Date(String str) {
		   Date date =null;
		   if(str==null||str.length()==0){
			   return null;
		   }
		   SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		   try {
			date = sdf.parse(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   return date;
	   }
}
