import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg5_karakterskala {

	public static void main(String[] args) {
		String melding="Skriv inn poengsum";
		
		String poeng1="F";
		String poeng2="E";
		String poeng3="D";
		String poeng4="C";
		String poeng5="B";
		String poeng6="A";
		for(int i=1;i<=10;i++)
		{
			
		int	poeng=Integer.parseInt(showInputDialog("skriv inn poengsum: "));
		if(poeng<0&&poeng>100)
		{
			poeng=Integer.parseInt(showInputDialog("skriv inn poengsum: "));
		}
		
			else if(poeng>0&&poeng<=39)
		{
			melding=poeng1;
			System.out.println("karakter er: " +melding);
			
		}
		else if(poeng>39&&poeng<=49)
		{
			melding=poeng2;
			System.out.println("karakter er: " +melding);
			
		}
		else if(poeng>49&&poeng<=59)
		{
			melding=poeng3;
			System.out.println("karakter er: " +melding);
			
		}
		else if(poeng>59&&poeng<=79)
		{
			melding=poeng4;
			System.out.println("karakter er: " +melding);
		
		}
		else if(poeng>79&&poeng<=89)
		{
			melding=poeng5;
			System.out.println("karakter er: " +melding);
			
		}
		else if(poeng>89&&poeng<=100)
		{
			melding=poeng6;
			System.out.println("karakter er: " +melding);
			
		}
		else 
		{
			showMessageDialog(null,"Det er ugyldig karakter prøv på nett");
			i--;
		}
		}
		
		{
		
		
}
	}
}
