package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Insert zodiac sign");
		Zodiac sign = Zodiac.valueOf(input);
		testZodiac(sign);
	}
	
	 // 3. Make a main method to test your method
	
	static void testZodiac(Zodiac z) {
		
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "test Aries");
			break;
		case TAURUS: 
			JOptionPane.showMessageDialog(null, "test Taurus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "test Gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "test Cancer");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "test Leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "test Virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "test Libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "test Scorpio");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "test Sagittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "test Capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "test Aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "test Pisces");
			break;
		default:
			JOptionPane.showMessageDialog(null, "default case");
			break;
		}
	}
	
}
