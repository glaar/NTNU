
//inkluderte hjelpeprogrammer
import 	javax.swing.JOptionPane;  

class oppgave2d
	{ 
		public static void main(String[] args) 
		{
			
		//Variabeldeklarasjon: type - navn - verdi. 
			String		inputTall1 		= 	JOptionPane.showInputDialog("Sett en �vre grense for utregning");
			int 		grense			= 	Integer.parseInt( inputTall1 );	
			int			tall1			= 	0;			
			int			tall2			= 	0;		
			int			sum				=	1; 
			
			//Utf�relse av programmet. {
				
					System.out.println("summen er n�: " + tall2);
				//summen av de to f�reg�ende tallene, og oppdatere summen. 
				do{
					System.out.println("summen er n�: " + sum); //skriver ut summen
					tall1=tall2; 		//oppdaterer tall1 til tall2
					tall2=sum; 			//oppdaterer tall2 til sum
					sum = tall1+tall2;	//oppdaterer summen. 
				}while (grense>sum);
		      		
			// } slutt p� det programmet gj�r.  
			
			//Avslutter
			System.exit(0);
			
		}	//end metode main( )
	}	//end of program

	