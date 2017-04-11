package org.shaohuogun.common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Utility {
	
	public final static String UTF8 = "utf-8";
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static String formatDate(Date date) throws Exception {
		if (date == null) {
			throw new Exception("Invalid arguments.");
		}
		
		return dateFormat.format(date);
	}
	
	public static Date parseDate(String date) throws Exception {
		if ((date == null) || date.isEmpty()) {
			throw new Exception("Invalid arguments.");
		}
		
		return dateFormat.parse(date);
	}
	
	public static String trimInvalidChar(String fileName) {
		fileName = fileName.replace("\\", "");
		fileName = fileName.replace("/", "");
		fileName = fileName.replace(":", "");
		fileName = fileName.replace("*", "");
		fileName = fileName.replace("?", "");
		fileName = fileName.replace("\"", "");
		fileName = fileName.replace("<", "");
		fileName = fileName.replace(">", "");
		fileName = fileName.replace("|", "");
		// 前面的替换会产生空格,最后将其一并替换掉
		fileName = fileName.replace(" ", "");
		return fileName;
	}
	
	public static String readFile(String path) throws Exception {
		if ((path == null) || path.isEmpty()) {
			throw new Exception("Invalid arguments.");
		}

		StringBuffer sb = new StringBuffer();
		InputStream is = new FileInputStream(path);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String line = reader.readLine();
		while (line != null) {
			sb.append(line);
			sb.append("\n");
			line = reader.readLine();
		}
		
		reader.close();
		is.close();
		return sb.toString();
	}

}
