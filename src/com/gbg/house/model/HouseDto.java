package com.gbg.house.model;

import com.gbg.host.model.RoomDto;

public class HouseDto extends RoomDto{
	
//	private String reservationId;
//	private int roomId;
//	private String userId;
	private String checkIn;
	private String checkOut;
	private String price;
	private String reservationDate;
	private String person;
	private String oksign;
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getOksign() {
		return oksign;
	}
	public void setOksign(String oksign) {
		this.oksign = oksign;
	}
	
	
	
	
}
