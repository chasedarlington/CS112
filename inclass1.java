/* 
1. Write Java code for taking the input of 2 numbers and then finding and displaying their sum, difference, product, quotient, and remainder.

2. Write a program to calculate and display the area and circumference of a circle.  The radius will be entered by the user. Use appropriate variable names.

3. Write a program to take the input of two numbers and then swap their values. Your code should display the original and the modified  values of the variables .

4. Write  a program to  convert temperature from Celsius to Fahrenheit.
*/

import java.util.Scanner;

public class inclass1
{
	public static void main(String [] args)
	{Scanner Input = new Scanner(System.in); //input is an object of scanner class

	
	System.out.print("\n" + "1. Write Java code for taking the input of 2 numbers and then finding and displaying:" + "\n" 
			+ "their sum, difference, product, quotient, and remainder." + "\n");
		float num1;
		float num2;
		System.out.print("Enter first number:"); //displaying prompt for num1
		num1 = Input.nextInt(); //Input.nextInt() reads the number from console
		System.out.print("Enter second number:"); //displaying prompt for num2
		num2 = Input.nextInt(); //Input.nextin() reads the number from console
		float sum = num1 + num2;
		float difference = num1 - num2;
		float product = num1 * num2;
		float quotient = num1 / num2;
		float remainder	= (int)num1%(int)num2;
		System.out.print("Sum=" + sum + "\n");
		System.out.print("Difference=" + difference + "\n"); 
		System.out.print("Product=" + product + "\n");
		System.out.print("Quotient=" + quotient + "\n");
		System.out.print("Remainder=" + remainder + "\n" + "\n");


	System.out.print("2. Write a program to calculate and display the area and circumference of a circle." + "\n" 
			+ "The radius will be entered by the user. Use appropriate variable names." + "\n");
		float radius;
		System.out.print("Enter radius of the circle:"); //displaying prompt for num1
		radius = Input.nextFloat(); //Input.nextInt() reads the number from console
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius,2);
		System.out.print("Circumference=" + (float)circumference + "\n");	
		System.out.print("Area=" + (float)area + "\n" + "\n");



	System.out.print("3. Write a program to take the input of two numbers and then swap their values." +"\n" 
			+ "Your code should display the original and the modified  values of the variables." + "\n");
		float num3, num4, temp;
		System.out.print("Enter first number:"); //displaying prompt for num1
		num3 = Input.nextInt(); //Input.nextInt() reads the number from console
		System.out.print("Enter second number:"); //displaying prompt for num2
		num4 = Input.nextInt(); //Input.nextin() reads the number from console
		System.out.print("Before swapping: num1,num2 = " + num3 + ", " + num4 + "\n");
		temp = num3;
		num3 = num4;
		num4 = temp;
		System.out.print("After swapping: a,b = " + num3 + ", " + num4 + "\n" + "\n");	
	

	System.out.print("4. Write  a program to  convert temperature from Celsius to Fahrenheit." + "\n");
		float temperature_fahrenheit;
		System.out.print("Enter temperature in Celsius:"); //displaying prompt for num1
		temperature_fahrenheit = Input.nextFloat(); //Input.nextInt() reads the number from console
		float temperature_celsius = (float)1.8 * temperature_fahrenheit + (float)32;  //Formula is 1.8C + 32
		System.out.print("Temperature in Fahrenheit=" + temperature_celsius + "\n" + "\n");
		
	}

}




