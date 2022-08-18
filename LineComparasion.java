package day3;

import java.util.Scanner;

public class LineComparasion 
{

	public static void Length(int x1,int y1,int x2,int y2) 
	{
		float len =(float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println("Length of line AB is "+ len);	
	}
	public static void Length(int x1,int y1,int x2,int y2,int x12,int y12,int x22,int y22)
	{
		float len1 =(float) Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		float len2 =(float) Math.sqrt((x12-x22)*(x12-x22)+(y12-y22)*(y12-y22));		
		if (len1==len2) 
		{
			System.out.println("Both line are equal");
			LengthCompare(len1,len2);
		}
	}
			
	public static void LengthCompare(float a, float b) 
	{
		if (a>b)
		{
			System.out.println("Length of AB is greater");
		}
		else if (a<b) 
		{
			System.out.println("Length of PQ is greater");
		}
		else
		{
			System.out.println("Both line are equal");
		}
					
	}
			
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("For 1st line AB");
		System.out.println("Enter co-ordinate of point A (x,y) ");
		int xA = sc.nextInt();
		int yA = sc.nextInt();
		System.out.println("Enter co-ordinate of point B (x,y) ");
		int xB = sc.nextInt();
		int yB = sc.nextInt();
		System.out.println("For 2nd line PQ");
		System.out.println("Enter co-ordinate of point P (x,y) ");
		int xP = sc.nextInt();
		int yP = sc.nextInt();
		System.out.println("Enter co-ordinate of point Q (x,y) ");
		int xQ = sc.nextInt();
		int yQ = sc.nextInt();
		Length(xA,yA,xB,yB,xP,yP,xQ,yQ);
	}

}

