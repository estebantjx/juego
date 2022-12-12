
import java.util.*;
public class Ejecucion {
	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		Juego ju = new Juego();
        boolean e=true;
        int opc;
        int op;
	
		
			
				System.out.println("\n(1): Piedra");
				System.out.println("(2): Papel");
				System.out.println("(3): Tijera");
				System.out.println("(4): Salir");
              
				opc = sc.nextInt();

            
              do 
                {
                    if(opc==1)
                    {
                       ju.piedra();
                    }
                    else if(opc==2)
                    {
                       ju.papel();
                    }
                    else if(opc==3)
                    {
                       ju.tijera();
                    }
                    
                 
                  
                }while(opc==4);
                   
                

			
		
		
	}
}
