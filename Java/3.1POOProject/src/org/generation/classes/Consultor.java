package org.generation.classes;

public class Consultor implements Pagable	{
	private String razonSocial;
	private String RFC;
	private double costoHora;
	public Consultor(String razonSocial, String razonRFC, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		this.RFC = razonRFC;
		this.costoHora = costoHora;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}//getRazonSocial
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}//setRazonSocial
	public String getRFC() {
		return RFC;
	}//getRazonRFC
	public void getRFC(String razonRFC) {
		this.RFC = razonRFC;
	}//setRazonRFC
	public double getCostoHora() {
		return costoHora;
	}//getCostoHora
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}//setCostoHora
	@Override
	public String toString() {
		return "Consultor [razonSocial=" + razonSocial + ", razonRFC=" + RFC + ", costoHora=" + costoHora + "]";
	}//toString
	
	
}//class Consultor
