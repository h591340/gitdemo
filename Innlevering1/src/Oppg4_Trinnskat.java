import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Oppg4_Trinnskat {
	public static void main(String[] args) {
		double sats1=0.00;
		double sats2=0.0093;
		double sats3=0.0241;
		double sats4=0.1152;
		double sats5=0.1452;
		double skatt1=0;
		double skatt2=0;
		double skatt3=0;
		double skatt4=0;
		double skatt5=0;
		String melding="vennligst skriv din inntekt: ";
		
		int inntekt=Integer.parseInt(showInputDialog("vennligst skriv din inntekt: "));
		if(inntekt<=164100)
		{
			
			showMessageDialog(null,"Din trinnskatt er: "+skatt1 +" kr");
			
		}
		
		else if(inntekt>=164101 && inntekt <=230950)
		{
			skatt2=inntekt*sats2;
			showMessageDialog(null,"Din trinnskatt er: "+skatt2 +" kr");
			
		}
		
		else if(inntekt>=230951 && inntekt <=580650)
		{
			skatt3=inntekt*sats3;
			showMessageDialog(null,"Din trinnskatt er: "+skatt3 +" kr");
		
		}
		else if(inntekt>=580651 && inntekt <=934050)
		{
			skatt4=inntekt*sats4;
			showMessageDialog(null,"Din trinnskatt er: "+skatt4 +" kr");
		}
		else
		{
			skatt5= inntekt*sats5;
			showMessageDialog(null,"Din trinnskatt er: "+skatt5 +" kr");
			
		}
}




}
