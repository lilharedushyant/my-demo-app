package com.ezio.BasicProgram;

public class Hello {
	public static boolean submit=false;
	
	public void firstM() {
		
		
		System.out.println("first "+submit +"  first !submit        "+(!submit));
		
		if(!submit) {
			
			System.out.println("inside if 2nd   "+submit +"   if !submit       "+(!submit));
			submit=true;
			firstM();
		}
		secondM();	
	}
	
	public void secondM() {
		
		System.out.println("secondM     "+submit +"    secondM      "+(!submit));
		
		if(!submit) {
			
			System.out.println(" inside secondM if    "+submit +"          "+(!submit));
			secondM();
			System.out.println("hellooooooooooo");
		}	
	}
	
	public static void main(String args[]) {
		
		Hello h1=new Hello();
		h1.firstM();
		
		
	}

}
