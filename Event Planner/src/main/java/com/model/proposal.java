package com.model;

public class proposal {
	
	
private	String Event_title;	
private String sponsor_of_event;	
private String Event_location;
private String Date_time;
private String cost_of_event;
private String contact_name;
private String contact_phone_NO;

/**
 * @param event_title
 * @param sponsor_of_event
 * @param event_location
 * @param date_time
 * @param cost_of_event
 * @param contact_name
 * @param contact_phone_NO
 * @param contact_Email_address
 */
public proposal(String event_title, String sponsor_of_event, String event_location, String date_time, String cost_of_event,
		String contact_name, String contact_phone_NO) {
	super();
	Event_title = event_title;
	this.sponsor_of_event = sponsor_of_event;
	Event_location = event_location;
	Date_time = date_time;
	this.cost_of_event = cost_of_event;
	this.contact_name = contact_name;
	this.contact_phone_NO = contact_phone_NO;
	
}
/**
 * @return the event_title
 */
public String getEvent_title() {
	return Event_title;
}
/**
 * @param event_title the event_title to set
 */
public void setEvent_title(String event_title) {
	Event_title = event_title;
}
/**
 * @return the sponsor_of_event
 */
public String getSponsor_of_event() {
	return sponsor_of_event;
}
/**
 * @param sponsor_of_event the sponsor_of_event to set
 */
public void setSponsor_of_event(String sponsor_of_event) {
	this.sponsor_of_event = sponsor_of_event;
}
/**
 * @return the event_location
 */
public String getEvent_location() {
	return Event_location;
}
/**
 * @param event_location the event_location to set
 */
public void setEvent_location(String event_location) {
	Event_location = event_location;
}
/**
 * @return the date_time
 */
public String getDate_time() {
	return Date_time;
}
/**
 * @param date_time the date_time to set
 */
public void setDate_time(String date_time) {
	Date_time = date_time;
}
/**
 * @return the cost_of_event
 */
public String getCost_of_event() {
	return cost_of_event;
}
/**
 * @param cost_of_event the cost_of_event to set
 */
public void setCost_of_event(String cost_of_event) {
	this.cost_of_event = cost_of_event;
}
/**
 * @return the contact_name
 */
public String getContact_name() {
	return contact_name;
}
/**
 * @param contact_name the contact_name to set
 */
public void setContact_name(String contact_name) {
	this.contact_name = contact_name;
}
/**
 * @return the contact_phone_NO
 */
public String getContact_phone_NO() {
	return contact_phone_NO;
}
/**
 * @param contact_phone_NO the contact_phone_NO to set
 */
public void setContact_phone_NO(String contact_phone_NO) {
	this.contact_phone_NO = contact_phone_NO;
}
/**
 * @return the contact_Email_address
 */

@Override
public String toString() {
	return "proposal [Event_title=" + Event_title + ", sponsor_of_event=" + sponsor_of_event + ", Event_location="
			+ Event_location + ", Date_time=" + Date_time + ", cost_of_event=" + cost_of_event + ", contact_name="
			+ contact_name + ", contact_phone_NO=" + contact_phone_NO + ", contact_Email_address="
			+  "]";
}



}