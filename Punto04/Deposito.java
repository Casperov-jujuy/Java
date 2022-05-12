package Punto04;

public class Deposito extends Thread {
	
	public void run() {
		
for (int i=0;i<40;i++) {
			
			System.out.println ("--------------------------------------------------");
			System.out.println ("Caja de Ahorro: "+CajitaDeAhorro.saldo );
			System.out.println ("DEPOSITO");
			
			CajitaDeAhorro.saldo = CajitaDeAhorro.saldo+300;
			System.out.println ("Caja de Ahorro: "+CajitaDeAhorro.saldo );
			System.out.println ("--------------------------------------------------");
		}

	try {

		Thread.sleep(50);            
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
