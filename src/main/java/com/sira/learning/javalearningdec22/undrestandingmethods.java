package com.sira.learning.javalearningdec22;

public class undrestandingmethods {
	
public int addition(int fValue,int sValue) {
		
		//int firstvalue = 10;
		//int secondvalue = 20;
		
		//int addition = firstvalue + secondvalue;
	int addition = fValue + sValue;
	return addition;
	//System.out.println("Addition of two values are =" +addition);
	}
public void substraction() {
	
	int firstvalue = 10;
	int secondvalue = 20;
	
	int substraction = firstvalue - secondvalue;
	System.out.println("Substraction of two values are =" +substraction);
}


public int multiplication(int fvalue,int svalue) {
int multiplication=fvalue * svalue;
return multiplication;
}








   public static void main(String[] args) {
		undrestandingmethods undrestandingmethods = new undrestandingmethods();
		System.out.println("Addition of two values are="+undrestandingmethods.addition(26,46));
		undrestandingmethods.substraction();
		System.out.println("Multiplication of two values are="+undrestandingmethods.multiplication(5,2));
		
	}

}
