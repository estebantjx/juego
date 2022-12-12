import java.util.*;

public class Juego
 {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	String pc;
	String usuario;
	
	private String getOpcion() 
	{
		int numero;
		String opcion = "";
		numero = rd.nextInt(3);
		if(numero == 0) 
		{
			opcion = "piedra";
		}
		else if(numero == 1) 
		{
			opcion = "papel";
		}
		else if(numero == 2) 
		{
			opcion = "tijera";
		}
		return opcion;
	}
	
	private void empate(String usuario, String pc)
	 {
		System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("EMPATE");
	}
	private void victoria(String usuario, String pc) 
	{
       System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("GANASTE");
	}
	private void perdida(String usuario, String pc) 
	{
		System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("PERDISTE");
	}
	protected void piedra() 
	{
		usuario = "piedra";
		pc = this.getOpcion();
		if(usuario == pc) 
		{
			this.empate(usuario, pc);
		}
		else if(pc == "papel") 
		{
			this.perdida(usuario, pc);
		}
		else if(pc == "tijera") 
		{
			this.victoria(usuario, pc);
		}
		
	}
	
	
	public void papel() 
	{
		usuario = "papel";
		pc = this.getOpcion();
		if(usuario == pc)
	    {
			this.empate(usuario, pc);
		}
		else if(pc == "tijera") 
		{
			this.perdida(usuario, pc);
		}
		else if(pc == "piedra") 
		{
			this.victoria(usuario, pc);
		}
	}
	public void tijera() 
	{
		usuario = "tijera";
		pc = this.getOpcion();
		if(usuario == pc) 
		{
			this.empate(usuario, pc);
		}
		else if(pc == "piedra") 
		{
			this.perdida(usuario, pc);
		}
		else if(pc == "papel") 
		{
			this.victoria(usuario, pc);
		}
	}


}
