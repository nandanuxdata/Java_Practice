package variables;

public class Variables {
	public static void main(String[] args) {
		
	
	//Variables are named memory locations used to store value/data.
	
	
		
		
	/* 1. Declaration   
		
		Statement which Specifies what type of data we are storing inside that variable.
		
	*/	
	
	// The memory for the variable will be decided by JVM based on the data type.
	//Syntax
	//Data_type Variable_Name;
		
	//*****************************************************************************************************//
    System.out.println("                      ***  Variable declaration  ***         ");  
    System.out.println();
    
    
	byte byte_variable; // For byte Data type 8-bits or 1 Byte of memory will be allocated..
	
	System.out.println("Variable declared using byte can store value from -128(-2^7) to 127(2^7 -1). ");
	System.out.println();
	
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	
	short short_variable; // For Short data type 16-bits or 2 bytes of memory will be allocated.
	
	System.out.println("Variable declared using short can store value from -32768(-2^15) to 32767(2^15 -1).  ");
	
	System.out.println();
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	
	int int_variable; // For int data type 32-bits or  4 bytes of memory will be allocated.
	
	System.out.println("Variable declared using int can store values from  -2,147,483,648 (-2^31) to 2,147,483,647 (2^31-1) ");
	
	System.out.println(); 
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	
	long long_variable; // For long data type 64-bits or 8 bytes of memory will be allocated.
	
	System.out.println("Variable declared with long can store value from -9,223,372,036,854,775,808 (-2^63) to 9,223,372,036,854,775,807 (2^63 – 1)");
	
	System.out.println();
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	
	float float_variable; // For float data type 32-bits or 4-bytes of memory will be allocated.
	
	System.out.println("Variable declared with float can store value from 1.40129846432481707e-45 to 3.40282346638528860e+38 (positive or negative)");
	System.out.println();
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	
	double double_variable; // For double data type 64-bits or 8-bytes of memory will be allocated. 
	
	System.out.println("Variable declared with float can store value from 1.7e-308 to 1.7e+308");
	System.out.println();
	System.out.println("               		             **-**");
	System.out.println();
	
	
	
	char char_variable; // For char data type 16-bits or 2-bytes of memory will be allocated.
	
	System.out.println("Variable declared with char will store the unicode value of the character. ");
	System.out.println();
	System.out.println("               		             **-**");
	System.out.println();
	  
	
	
	boolean bool_variable; /* Memory for variable declared with data type boolean is decided based on the Operating system.
	For windows it is 8-bits or 1-byte. And for MAC it*/ 
	
	System.out.println("Variable declared with boolean is used to store \"True\" or \"FALSE\"");
	
	
	
	
	
	 /* 2. Initialization
	
			Statement which is written to store the value/data inside variable using assignment operator.
	
	*/
	System.out.println("                      ***  Variable initialization  ***         ");
	System.out.println();
	 
	int_variable=127;
	System.out.println("int_variable is initialized with value "+int_variable);
	System.out.println();
	
	
	short_variable=32767;
	System.out.println("short_variable is initialized with the value "+short_variable);
	System.out.println();
	
	int_variable=655610552;
	System.out.println("int_variable is initialized with the value "+int_variable);
	System.out.println();
	
	long_variable=956545646;
	System.out.println("long_variable is initialized with the value "+long_variable);
	System.out.println();
	
	float_variable=524.5265f;
	System.out.println("float_variable is initialized with "+float_variable);
	System.out.println();
	
	double_variable=256555.5445545555;
	System.out.println("double_variable is initialized with the value "+double_variable);
	System.out.println();
	
	char_variable='A';
	System.out.println("char_variable is initialized with the value "+char_variable);
	System.out.println();
	
	bool_variable=true;
	System.out.println("bool_variable is initialized with the value " +bool_variable);
	 
	
	 
	}

}
