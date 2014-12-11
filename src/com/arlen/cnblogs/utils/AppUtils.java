package com.arlen.cnblogs.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import android.annotation.SuppressLint;
import android.util.Log;

public class AppUtils {

	/**
	 * ���ַ���ת��ΪURL����
	 * 
	 * @param string
	 * @return URL
	 */
	public static URL parseStringToUrl(String string) {
		URL url = null;
		try {
			Log.i("parseStringToUrl", "ת��:" + string);
			url = new URL(string);
			Log.i("parseStringToUrl", "ת���ɹ�");
		} catch (MalformedURLException e) {
			Log.e("parseStringToUrl", "ת��ʧ��");
			e.printStackTrace();
		}
		return url;
	}

	/**
	 * ��Stringת��ΪDate����
	 * 
	 * @param string
	 * @return Date
	 */
	@SuppressLint("SimpleDateFormat")
	public static Date parseStringToDate(String string) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				AppMacros.SIMPLE_DATA_FORMATE);
		Date date = null;
		try {
			date = dateFormat.parse(string);
		} catch (ParseException e) {
			Log.e("parseStringToDate", "ת��ʧ��");
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * ��Dateת��ΪString����
	 * 
	 * @param date
	 * @return String
	 */
	@SuppressLint("SimpleDateFormat")
	public static String parseDateToString(Date date) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					AppMacros.SIMPLE_DATA_FORMATE);
			return dateFormat.format(date);
		} catch (Exception e) {
			Log.e("parseDateToString", "ת��ʧ��");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ��ʱ��ת��Ϊ����
	 * 
	 * @param datetime
	 * @return
	 */
	public static String parseDateToChinese(Date datetime) {
		Date today = new Date();
		long seconds = (today.getTime() - datetime.getTime()) / 1000;

		long year = seconds / (24 * 60 * 60 * 30 * 12);// �������
		long month = seconds / (24 * 60 * 60 * 30);// �������
		long date = seconds / (24 * 60 * 60); // ��������
		long hour = (seconds - date * 24 * 60 * 60) / (60 * 60);// ����Сʱ��
		long minute = (seconds - date * 24 * 60 * 60 - hour * 60 * 60) / (60);// ���ķ�����
		long second = (seconds - date * 24 * 60 * 60 - hour * 60 * 60 - minute * 60);// ��������

		if (year > 0) {
			return year + "��ǰ";
		}
		if (month > 0) {
			return month + "��ǰ";
		}
		if (date > 0) {
			return date + "��ǰ";
		}
		if (hour > 0) {
			return hour + "Сʱǰ";
		}
		if (minute > 0) {
			return minute + "����ǰ";
		}
		if (second > 0) {
			return second + "��ǰ";
		}
		return parseDateToString(datetime);
	}

	public static <T> void removeDuplicate(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
	}
}
