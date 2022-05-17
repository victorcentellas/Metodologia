
public class Beca {
	private int Beca;
private int mesInicio;
private int mesFin;
private int SalarioMensual;


public int getBeca() {
	return Beca;
}


public void setBeca(int beca) {
	Beca = beca;
}


public int getMesInicio() {
	return mesInicio;
}


public void setMesInicio(int mesInicio) {
	this.mesInicio = mesInicio;
}


public int getMesFin() {
	return mesFin;
}


public void setMesFin(int mesFin) {
	this.mesFin = mesFin;
}


public int getSalarioMensual() {
	return SalarioMensual;
}


public void setSalarioMensual(int salarioMensual) {
	SalarioMensual = salarioMensual;
}


public Beca (int Beca,int mesInicio,int mesFin,int SalarioMensual) {
	this.Beca=Beca;
	this.mesInicio=mesInicio;
	this.mesFin=mesFin;
	this.SalarioMensual=SalarioMensual;
}
public int precioBeca() {
	return SalarioMensual *(this.mesFin - this.mesInicio+1);
}

public boolean compatible(Beca b) {
	return this.mesInicio<b.getMesInicio() && this.mesFin<b.getMesInicio() || this.mesInicio>b.getMesFin() && this.mesFin>b.getMesFin();
}
public String toString() {
	return "Beca "+ Beca + ", Mes Inicio "+ mesInicio+", Mes Fin "+ mesFin+", Salario Mensual "+ SalarioMensual +", Precio Beca "+ precioBeca();
}

}
