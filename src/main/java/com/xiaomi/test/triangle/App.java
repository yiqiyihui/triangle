package com.xiaomi.test.triangle;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{   
	
	
	public static String trianglejudge(float a,float b,float c)
	{
		if(a<=0||b<=0||c<=0)
			return "这不是个三角形";
			if(a==b&&b==c)
				return"这是个等边三角形";
			else if(a==b||b==c||c==a)
			     return"这是个等腰三角形";
			else 
				return "这是个普通的三角形";
				
			}
	
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
           System.out.println("请输入d,e,f的值");
    	 float d=scanner.nextFloat();
    	 float e=scanner.nextFloat();
    	 float f=scanner.nextFloat();
    	 System.out.println(trianglejudge(d,e,f));
          scanner.close();
    }
}
