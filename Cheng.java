//Ka Cheng @10/2/18
// Program description: Create a program that will ask the user to enter two numbers and display the sum of them in a dialog box
//
// import the java optional package that has the dialog box
import javax.swing.JOptionPane;
//
public class Cheng{
  public static void main(String args[]){

	  	String FullName,FirstNum, SecondNum;
	  	double number1,number2;
	  	double sum, difference, product, remainder, quotient;

	  	FullName = JOptionPane.showInputDialog("Enter your full name: ");
	  	FirstNum = JOptionPane.showInputDialog("Enter first number: ");
	  	SecondNum = JOptionPane.showInputDialog("Enter second number: ");

	  	number1 = Integer.parseInt(FirstNum);
	  	number2 = Integer.parseInt(SecondNum);

	  	sum = number1 + number2;
	  	difference = number1 - number2;
	  	product = number1 * number2;
	  	quotient = number1 / number2;
	  	remainder = number1 % number2;

	  	JOptionPane.showMessageDialog(null, "My name is: "+ FullName +"\n" +
	  			"\t\t\t The entered number is:  "+ number1 +" and "+ number2 +"\n" +
	  			"\t\t\t The sum is: "+ sum +"\n"+
	  			"\t\t\t The difference is: "+ difference +"\n"+
	  			"\t\t\t The product is: "+ product +"\n"+
	  			"\t\t\t The quotient is: "+ quotient +"\n"+
	  			"\t\t\t The remainder is: "+ remainder +"\n", "CalculationResult", JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
        } // end of main method
} // end of class Cheng
