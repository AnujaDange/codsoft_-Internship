package com.Task_2;

import java.util.Scanner;

public class StudentGradeCalculator {
	static Scanner sc = new Scanner(System.in);
	 public void marks()
	   {
		  int size;
		  System.out.println("Enter total Subject = ");
		  size=sc.nextInt();
		  System.out.println("Enter the Marks of "+size+" Subject :: ");
		  int[] marks=new int[size];
		  for(int i=0 ; i<marks.length ; i++)
		  {
			  marks[i]=sc.nextInt();
		  }
		 int sum = 0;
		 for(int i=0 ; i<marks.length ; i++)
		 {
			  sum=sum+marks[i];
		 }
		 System.out.println("Total Marks = "+sum);
	    float avg;
		 avg=sum/size;
		 System.out.println("Average Percentage = "+avg);
		 char grade;
		 System.out.print("Grade = ");
		  if(avg>90)
		  {
			  System.out.print(" A+ Grade with Distiction");
		  }
		  else if(avg>60)
		  {
			  System.out.print(" A (First Class)");
		  }
		  else if(avg>45)
		  {
			  System.out.println(" B (Second Class)");
		  }
		  else if(avg>35)
		  {
			  System.out.print(" Pass ");
		  }
		  else
		  {
			  System.out.print(" Fail ");
		  }
	 }
   public static void main(String[] args) {
	   StudentGradeCalculator obj = new StudentGradeCalculator();
	   obj.marks();
	   
}
}
