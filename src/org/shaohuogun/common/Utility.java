package org.shaohuogun.common;

import java.io.File;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Utility {
	
	public final static String ENCODE_UTF8 = "utf-8";
	
	private final static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static String formatDate(Date date) throws Exception {
		if (date == null) {
			throw new NullPointerException("Date cann't be null.");
		}

		return dateFormat.format(date);
	}
	
	public static Date parseDate(String date) throws Exception {
		if ((date == null) || date.isEmpty()) {
			throw new IllegalArgumentException("Date cann't be null or empty.");
		}
		
		return dateFormat.parse(date);
	}
	
    public static boolean isPathExists(String path) {
        if ((path == null) || path.isEmpty()) {
            throw new IllegalArgumentException("Path cann't be null or empty.");
        }

        return new File(path).exists();
    }

	public static String getMd5Code(byte[] source) throws Exception {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(source);
		byte tmp[] = md.digest();
		char str[] = new char[16 * 2];
		int j = 0;
		for (int i = 0; i < 16; i++) {
			byte curByte = tmp[i];
			str[j++] = hexDigits[curByte >>> 4 & 0xf];
			str[j++] = hexDigits[curByte & 0xf];
		}
		
		return new String(str);
	}
	
}
