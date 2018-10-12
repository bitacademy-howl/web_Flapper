package com.flapper.test.BeanClassInterface;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BeanIsClassification implements InterfaceOfBeanIsClassification{
	private Date date;
	private String musicTitle;
	
	public String getMusicTitle() {
		return musicTitle;
	}

	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}

	private SimpleDateFormat dateFormat;
	
	public BeanIsClassification() {
		this.date = Calendar.getInstance().getTime();
		this.dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	}
	
	@Override
	public String getDate() {
		return this.dateFormat.format(date);
	}
	
	@Override
	public void setDate(String date) {
		try {
			this.date = this.dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			this.date = null;
		}
	}
	
	@Override
	public String toString() {
		return "BeanIsClassification [date=" + this.dateFormat.format(this.date) + ", title="+this.musicTitle+"]";
	}
}
