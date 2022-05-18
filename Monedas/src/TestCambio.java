public class TestCambio {

    public static void main(String[] args) {
        System.out.println ("¿Cuántos billetes hacen falta para cambiar un cheque de 32?" );
        Cambio c = new Cambio(75, new int[]{20,10,5,1});

        System.out.println("Billetes de 20: "+c.getVectorSeleccion()[0]);
        System.out.println("Billetes de 10: "+c.getVectorSeleccion()[1]);
        System.out.println("Billetes de 5: "+c.getVectorSeleccion()[2]);
        System.out.println("Billetes de 1: "+c.getVectorSeleccion()[3]);
    }
}
