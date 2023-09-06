package org.generations.classes;

import org.generations.util.Pagable;

public class Consultor implements Pagable{
	private String razonSocial;
	private String RFC;
	private double costoHora;
	
	public Consultor(String razonSocial, String rFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		RFC = rFC;
		this.costoHora = costoHora;
	} // Metodo especial Constructor
	
	// Metodos Gets and Sets
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	@Override
	public String getRfc() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public double getCostoHora() {
		return costoHora;
	}
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}
	@Override
	public String toString() {
		return "Consultor [razonSocial=" + razonSocial + ", RFC=" + RFC + ", costoHora=" + costoHora + "]";
	}// Metodo toString

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "--EXTERNO--"+this.razonSocial;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return -1;
	}
	 
	@Override
	public double calculateSalary(int days) { 
		return ((days*8)*this.costoHora)*1.16;
	}
	
	
}// class consultor
