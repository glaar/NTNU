
//inkluderte hjelpeprogrammer
import 	javax.swing.JOptionPane; 
import 	javax.swing.JTextArea; 
import  java.text.DecimalFormat;

class tallformatering 
	{ 
		public static void main(String[] args) 
		{
			
		//Variabeldeklarasjon: type - navn - verdi.
			JTextArea		utOmrade		= 	new JTextArea(); // se utOmrade lenger nede for hva som blir skrevet ut. 
			String 			utStreng; 		//= se utStreng under.
			String			inputTall1 		= 	JOptionPane.showInputDialog("Skriv inn et tall med en eller flere desimaler her!");
			double 			tall1			= 	Double.parseDouble( inputTall1 );	
			DecimalFormat	enDesimaler 	=  	new  DecimalFormat("0.0");
			DecimalFormat	treDesimaler 	=  	new  DecimalFormat("0.000");	
			
			//Utf�relse av programmet. {
			
				//utStreng inneholder det programmet skal skrive til skjermen. 
				utStreng = (  
						"Du skrev inn tallet " + inputTall1 + ".\n" +
						"Det formaterte tallet blir: " + enDesimaler.format(tall1) + "med en desimal.\n" +
						"Det formaterte tallet blir: " + treDesimaler.format(tall1) + " med tre desimaler.\n" 
						);
				
				//Her sender man utStreng til utOmr�det, tekst til tekstboks. 
				utOmrade.setText(utStreng);  
				
				//Her blir teksten vist i tekstboksen. 
				JOptionPane.showMessageDialog(null,utOmrade, "Resultat",JOptionPane.PLAIN_MESSAGE ); 
	      		
				// } slutt p� det programmet gj�r.  
			
			//Avslutter
			System.exit(0);
			
		}	//end metode main( )
	}	//end of program

	