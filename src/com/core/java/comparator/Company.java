package com.core.java.comparator;

import java.util.Comparator;

public class Company implements Comparator<Company> {

	public int cid;

	public String cname;
	
	public float cfloat;
	
	
	public double cDouble;
	
	public char cChar;
	
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + "]";
	}

	/*
	 * @Override public int compare(Company o1, Company o2) {
	 * 
	 * 
	 * }
	 */
	
	
	
	
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
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
		Company other = (Company) obj;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		return true;
	}*/

	public Company(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cChar;
		long temp;
		temp = Double.doubleToLongBits(cDouble);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(cfloat);
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
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
		Company other = (Company) obj;
		if (cChar != other.cChar)
			return false;
		if (Double.doubleToLongBits(cDouble) != Double.doubleToLongBits(other.cDouble))
			return false;
		if (Float.floatToIntBits(cfloat) != Float.floatToIntBits(other.cfloat))
			return false;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		return true;
	}

	@Override
	public int compare(Company o1, Company o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
