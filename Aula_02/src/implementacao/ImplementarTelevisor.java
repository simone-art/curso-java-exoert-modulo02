package implementacao;

import beans.Televisor;

public class ImplementarTelevisor {
	
public static void main(String[] args) {
		
		Televisor tv = new Televisor();
		
		tv.ligar();
		
		System.out.println(tv.getVolume());
		
		tv.reduzirVolume();
		tv.reduzirVolume();
		System.out.println(tv.getVolume());
		
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println(tv.getVolume());
		
		tv.reduzirVolume();
		System.out.println(tv.getVolume());
		
		tv.mostrarStatus();
		
	}

}
