package com.subho.wipro.pjp.tm07.proj.med;

public class Employee {
	
		String lastName;
		long mobile;
		String email;
		String address;
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public long getMobile() {
			return mobile;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getAddress() {
			return address;
		}
		
		public String toString() {
			return getLastName() + "\t\t" + getMobile() + "\t\t" + getEmail() + "\t\t" + getAddress();
		}

}