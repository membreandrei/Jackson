package com.example.demo;

public class Personne {
	 
    public String nom;
    public Address address;
    
    public Personne() {}
    
    public Personne(String nom, Address address) {
    	this.nom = nom;
    	this.address = address;    	
    }
   
    public void setNom(String nom) {
        this.nom = nom;
    }

	public void setAddress(Address address) {
        this.address = address;
    }
			
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Personne other = (Personne) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", address=" + address + "]";
	}

}