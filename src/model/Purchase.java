package model;

import java.util.Date;

public class Purchase {
	
	private int idpurchase, product, user, creditnumber ,cv, price;
	private Date date, endDateCredit;
	private String address;

	public Purchase(int idpurchase, int product, int user, Date date,String address, int creditnumber, Date endDateCredit, int cv, int price) {
		super();
		this.idpurchase = idpurchase;
		this.product = product;
		this.user = user;
		this.date = date;
		this.address = address;
		this.creditnumber = creditnumber;
		this.endDateCredit = endDateCredit;
		this.cv = cv;
		this.price = price;
		
	}

	public int getIdpurchase() {
		return idpurchase;
	}

	public void setIdpurchase(int idpurchase) {
		this.idpurchase = idpurchase;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getCreditnumber() {
		return creditnumber;
	}

	public void setCreditnumber(int creditnumber) {
		this.creditnumber = creditnumber;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getEndDateCredit() {
		return endDateCredit;
	}

	public void setEndDateCredit(Date endDateCredit) {
		this.endDateCredit = endDateCredit;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	
	
	
}
