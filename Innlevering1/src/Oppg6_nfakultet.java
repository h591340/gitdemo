import static javax.swing.JOptionPane.*;
public class Oppg6_nfakultet {

	public static void main(String[] args) {
		
		int faktultet=1;
		String meldingTxt="skriv inn et nummer";
		int n=Integer.parseInt(showInputDialog(meldingTxt));
		if (n<0)
			showMessageDialog(null,"vi kan ikke finne n! for negative nummer ");
		else
		{
			
		for(int i=1;i<=n;i++)
		{
			if(n>0) {
				
			
			faktultet=faktultet*i;
			}
			
		}

		showMessageDialog(null,"verdien n!=: "+faktultet);
		
		}
			
			

		
	
			
		
		

	}

}
