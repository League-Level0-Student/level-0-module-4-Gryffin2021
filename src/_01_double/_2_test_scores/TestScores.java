package _01_double._2_test_scores;
import javax.swing.JOptionPane;
public class TestScores {
	public static void main(String[] args) {
		//An A is 90% to 100% A B is 80% to 89% A C is 70% to 79% A D is 60% to 69%
		String didiask = JOptionPane.showInputDialog(null, "What did you get on your most recent test?");
		double didiask2 = Double.parseDouble(didiask);
		if(didiask2 <= 59.9) {
			JOptionPane.showMessageDialog(null, "F! You suck!");
		}else if(didiask2 >= 60 && didiask2 <= 69){
			JOptionPane.showMessageDialog(null, "D. You tried.");
		}else if(didiask2 >= 69.1 && didiask2 <= 79){
			JOptionPane.showMessageDialog(null, "C. Ok grade.");
		}else if(didiask2 >= 79.1 && didiask2 <= 89){
			JOptionPane.showMessageDialog(null, "B! Pretty good.");
		}else if(didiask2 >= 89.1 && didiask2 <= 100){
			JOptionPane.showMessageDialog(null, "A! Wow! You must have studied very hard for that test!");
		}
	}
		
}	

