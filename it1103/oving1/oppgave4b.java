
//inkluderte hjelpeprogrammer
import 	javax.swing.JOptionPane; 
import 	javax.swing.JTextArea; 

class oppgave4b 
	{ 
		public static void main(String[] args) 
		{
			
		//Variabeldeklarasjon: type - navn - verdi.
			JTextArea	utOmrade		= 	new JTextArea(); // se utOmrade lenger nede for hva som blir skrevet ut. 
			String 		utStreng; 		//= se utStreng under.
			String		inputTall1 		= 	JOptionPane.showInputDialog("Skriv inn et tall her!");
			String		inputTall2 		= 	JOptionPane.showInputDialog("Skriv inn et annet tall her!");
			double 		tall1			= 	Double.parseDouble( inputTall1 );	
			double		tall2			=	Double.parseDouble( inputTall2 );
			double		sum 			=	(tall1 + tall2);
			int			count 			= 	1;
					
			
			//Utf�relse av programmet. {
			
				// while l�kke som trekker tall2 fra tall1 s� lenge tall1 er st�rre enn tall2. 
				while (tall1 > tall2) {
			            tall1-=tall2;
		        	    count++;	        	  
		          }
				
				//utStreng inneholder det programmet skal skrive til skjermen. 
				utStreng = (  
						"Du skrev inn tallene " + inputTall1 + " og " + inputTall2 + ".\n" +
						"Summen av disse tallen er: " + sum + ".\n" +
						"Og tallet " + inputTall2 + " g�r " + count + " ganger i tallet " + inputTall1 
						);
				
				//Her sender man utStreng til utOmr�det, tekst til tekstboks. 
				utOmrade.setText(utStreng);  
				
				//Her blir teksten vis i tekstboksen. 
				JOptionPane.showMessageDialog(null,utOmrade, "Resultat",JOptionPane.PLAIN_MESSAGE ); 
	      		
				// } slutt p� det programmet gj�r.  
			
			//Avslutter
			System.exit(0);
			
		}	//end metode main( )
	}	//end of program

	