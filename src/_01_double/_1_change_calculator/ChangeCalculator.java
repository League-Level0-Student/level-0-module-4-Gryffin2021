package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {
		//Ask the user how many pennies they have
String coinsP = JOptionPane.showInputDialog(null, "How many pennies do you have?");
double coinsP2 = Integer.parseInt(coinsP);
		// Ask the user how many nickels they have
String coinsN = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
double coinsN2 = Integer.parseInt(coinsN);
		// Ask the user how many dimes they have, and convert their answer
String coinsD = JOptionPane.showInputDialog(null, "How many dimes do you have?");
double coinsD2 = Integer.parseInt(coinsD);
		// Ask the user how many quarters they have, and convert their answer
String coinsQ = JOptionPane.showInputDialog(null, "How many dimes do you have?");
double coinsQ2 = Integer.parseInt(coinsQ);
		// Calculate how much money the user has.  Hint: Use a double variable 
double coinsP3 = (coinsP2 * 0.01);
double coinsN3 = (coinsN2 * 0.05);
double coinsD3 = (coinsD2 * 0.10);
double coinsQ3 = (coinsQ2 * 0.25);
double allcoins = (coinsN3 += coinsD3 += coinsQ3 += coinsP3);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, "You have $" + allcoins);
	}
}

