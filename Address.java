package com.example.demo;

public class Address {
	   
    public String zipcode;
    public String rue;
   
    public Address() {}
    
    public Address(String zipcode, String rue) {
    	this.zipcode = zipcode;
    	this.rue = rue;
    }
 
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public void setStreet(String rue) {
        this.rue = rue;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (zipcode == null) {
			if (other.zipcode != null)
				return false;
		} else if (!zipcode.equals(other.zipcode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", rue=" + rue + "]";
	}
    
}
