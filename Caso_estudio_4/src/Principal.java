
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Beca [] becas = { new Beca(1,1,10,150),new Beca(2,3,8,100),new Beca(3,5,6,100),new Beca(4,1,4,300), new Beca(5,6,12,200),new Beca(6,6,12,20),new Beca(7,7,8,500),new Beca(8,1,12,200)};
	Beca[] solucion= new Beca[becas.length];
	//Becas[] becasUsadas=new 
	}
	public static void  mejoresBecas(Beca[] becas, Beca[] solucion) {
		
	}
	public static int sumaBecas(Beca[] becas) {
		int suma=0;
		for(int i=0; i< becas.length;i++) {
		if(becas[i] != null) {
			suma+= becas[i].precioBeca();
			
		}
	}
return suma;
}
}
