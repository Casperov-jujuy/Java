package Punto04;

public class Main {

	public static void main(String[] args) {
		
		CajitaDeAhorro.saldo= 5000;
		
		Extraccion hilo1 = new Extraccion ();
		Deposito hilo2= new Deposito();
		hilo2.start();
		hilo1.start();
		
		try {
			hilo1.sleep(80);
			hilo2.sleep(30);
			hilo2.join();
			hilo1.join();
		} catch(Exception e) {
		}		
		
	}

}
class CajitaDeAhorro{
	static int saldo;
}
