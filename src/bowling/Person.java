package bowling;

public class Person {
	
	private String name;
	private String address;
	private String gender;
	private String hand;
	private int phoneNum;
	private int usbcNum;
	
	public Person(String n, String a, String g, int p, String h, int u){
		this.setName(n);
		this.setAddress(a);
		this.setGender(g);
		this.setPhoneNum(p);
		this.setHand(h);
		this.setUsbcNum(u);
		
	}
	

	public static void main(String[] args) {
	
		

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getHand() {
		return hand;
	}


	public void setHand(String hand) {
		this.hand = hand;
	}


	public int getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}


	public int getUsbcNum() {
		return usbcNum;
	}


	public void setUsbcNum(int usbcNum) {
		this.usbcNum = usbcNum;
	}

}
