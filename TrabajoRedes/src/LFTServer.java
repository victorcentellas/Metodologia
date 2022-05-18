
public class LFTServer {
	private static String modo ;
	private static int puerto ;
	private static int max_clientes;
	private static String carpeta_path;
	
public static void main(String[] args) {
	if (args.length >4)
		throw new IllegalArgumentException("params: <modo> <puerto> <carpeta_servidor> <max_clientes>");

	else if(args.length <3 )
		throw new IllegalArgumentException("params: <puerto> <carpeta_servidor> <max_clientes>");
	
	if(args.length==4) {
		modo = args[0];
		puerto = Integer.parseInt(args[1]);
		 carpeta_path = args[2];
		 max_clientes = Integer.parseInt(args[3]);
		 LFTServer SSLServer = new LFTServer();
		 
		
	}else {
		puerto = Integer.parseInt(args[0]);
		 carpeta_path = args[1];
		 max_clientes = Integer.parseInt(args[2]);
		 LFTServer Server = new LFTServer();
	}
}


}
