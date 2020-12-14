package com.codistech;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.ReflectionUtils;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		/*
		 * SimpleDateFormat dateFormat = new
		 * SimpleDateFormat("dd/MM/yyyy hh:mm a"); try { Date d =
		 * dateFormat.parse("13/02/2015 8:35 PM");
		 * System.out.println(dateFormat.format(d.getTime()));
		 * System.out.println(d.getTime()); System.out.println("diff :: " +
		 * ((d.getTime() - new Date().getTime()) / 1000)); } catch (Exception e)
		 * { // TODO Auto-generated catch block // e.printStackTrace(); }
		 *
		 * // getValue("documentName", new DocumentsAllVo(".txt", "p12331.txt",
		 * // true)); }
		 */

		Date d = new Date(1429099733000l);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		System.out.println("date :: " + dateFormat.format(d));

	}

	public static void getValue(String fieldName, Object o) {

		try {
			Class<?> clazz = o.getClass();

			Field field = ReflectionUtils.findField(clazz, fieldName);
			ReflectionUtils.makeAccessible(field);
			Object value = field.get(o);

			System.out.println("value :: " + value);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
