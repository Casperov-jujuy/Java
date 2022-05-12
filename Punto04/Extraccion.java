package Punto04;

public class Extraccion extends Thread {
	
	
	@Override

	public void run () {
		for (int i=0;i<30;i++) {
			
			if (CajitaDeAhorro.saldo>=500) {
				System.out.println ("--------------------------------------------------");
				System.out.println ("Caja de Ahorro: "+CajitaDeAhorro.saldo );
				System.out.println ("EXTRACCIÓN");
				
				CajitaDeAhorro.saldo =CajitaDeAhorro.saldo-500;
				System.out.println ("Caja de Ahorro: "+CajitaDeAhorro.saldo );
				System.out.println ("--------------------------------------------------");
			}
			else {
				System.out.println ("--------------------------------------------------");
				System.out.println("No se puede realizar EXTRACCION ");
				System.out.println ("Caja de Ahorro: "+CajitaDeAhorro.saldo );
				System.out.println ("--------------------------------------------------");
			}
			
			try {

                Thread.sleep(100);            
              } catch (Exception e) {
                  e.printStackTrace();
              }
		}
	}
	
	
}
