package com.usuarios.entidades;

public class UsuarioLiferay {

	private long userId;
	private String firstName;
	public UsuarioLiferay(long userId, String firstName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
	}
	public UsuarioLiferay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof UsuarioLiferay))
			return false;
		UsuarioLiferay other = (UsuarioLiferay) obj;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UsuarioLiferay [userId=" + userId + ", firstName=" + firstName + "]";
	}

	
	
	
}