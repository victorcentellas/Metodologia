
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Beca [] becas = { new Beca(1,1,10,150),new Beca(2,3,8,100),new Beca(3,5,6,100),new Beca(4,1,4,300), new Beca(5,6,12,200),new Beca(6,6,12,20),new Beca(7,7,8,500),new Beca(8,1,12,200)};
	Beca[] solucion= new Beca[becas.length];
	Beca[] becasUsadas=new Beca[becas.length];
	mejoresBecas(becas,becasUsadas,solucion,0);
	for(int i=0;i<solucion.length;i++) {
		if(solucion[i]!=null) {
			System.out.println(solucion[i]);
		}
	}
	System.out.println(sumaBecas(solucion));
	}
	public static void  mejoresBecas(Beca[] becas, Beca[] becasUsadas,Beca[] solucion,int etapa) {
		if(etapa == becas.length-1) {
			int gananciaBecasUsadas= sumaBecas(becasUsadas);
			int gananciaSolucion= sumaBecas(solucion);
			if(gananciaBecasUsadas>gananciaSolucion) {
				for(int i=0;i<becasUsadas.length;i++) {
					solucion[i]=becasUsadas[i];
				}
			
			}
		}else {
			for(int i = 0;i<becas.length;i++) {
				if(esValida(becasUsadas,becas[i])) {
					becasUsadas[etapa]=becas[i];
					mejoresBecas(becas,becasUsadas,solucion,etapa+1);
					becasUsadas[etapa]=null;
					}else {
						mejoresBecas(becas,becasUsadas,solucion,etapa+1);

					}
				}
		}
	}
	public static boolean esValida(Beca[] becasUsadas,Beca b) {
		boolean correcto=true;
		for(int i=0;i<becasUsadas.length;i++) {
		if(becasUsadas[i]!= null && !becasUsadas[i].compatible(b)) {
			correcto=false;
		}
		}
		return correcto;
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
