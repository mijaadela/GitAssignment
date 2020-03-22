package clase;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git ! Denumirea proiectului de licență este Sistem informatic pentru evidența contabilă");
		
		FacturaCumparare factura = new FacturaCumparare("CantinaEminescu", 200, "Cathering");
		factura.populareValoareServiciu();
	}

}
