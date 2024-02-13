package com.example.demo.entities;

public class OwnerReg {
		
	
	    private String owner_fname; // First Name
	    private String owner_lname; // Last Name
	    private String owner_email; // Email
	    private String contact; // Contact Number
	    private String owner_aadhar; // Aadhar Number
	    private String owner_address; // Owner Address
	    private String owner_password;

	    // Getters and setters for each field

	    public String getOwner_password() {
			return owner_password;
		}

		public void setOwner_password(String owner_password) {
			this.owner_password = owner_password;
		}

		public String getOwner_fname() {
	        return owner_fname;
	    }

	    public void setOwner_fname(String owner_fname) {
	        this.owner_fname = owner_fname;
	    }

	    public String getOwner_lname() {
	        return owner_lname;
	    }

	    public void setOwner_lname(String owner_lname) {
	        this.owner_lname = owner_lname;
	    }

	    public String getOwner_email() {
	        return owner_email;
	    }

	    public void setOwner_email(String owner_email) {
	        this.owner_email = owner_email;
	    }

	    public String getContact() {
	        return contact;
	    }

	    public void setContact(String contact) {
	        this.contact = contact;
	    }

	    public String getOwner_aadhar() {
	        return owner_aadhar;
	    }

	    public void setOwner_aadhar(String owner_aadhar) {
	        this.owner_aadhar = owner_aadhar;
	    }

	    public String getOwner_address() {
	        return owner_address;
	    }

	    public void setOwner_address(String owner_address) {
	        this.owner_address = owner_address;
	    }

		@Override
		public String toString() {
			return "OwnerReg [owner_fname=" + owner_fname + ", owner_lname=" + owner_lname + ", owner_email="
					+ owner_email + ", contact=" + contact + ", owner_aadhar=" + owner_aadhar + ", owner_address="
					+ owner_address + "]";
		}
	    
	    
	

}
