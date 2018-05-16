/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;




/**
 *
 * @author tommymedaiyese
 */
public class DataCollection {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String [] args)
    {
       myAverage();
       Ascending();
       Descending();
       Sum();
       getMinValue();
       getMaxValue();
       Occurrence();
       sampleSize();
       Mode();
       Range();
       standardDeviation();
       Variance();
       zScore(30);
       confidenceInterval();
     
      
      
    }  
    
    public static void myAverage()
    {   
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        double total = 0.0;
        double grade;
        double average = 0.0;
        double counter = 0.0;
        
        while (counter < a.length) {
            grade = input.nextDouble();
            total = total + grade;
            counter++;
            
        }
        average = total / a.length;
        System.out.println("The average is: " + average); 
        
        
    } 
    
    public static void Ascending()
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
    
    
    
       public static void Descending() {
           
           
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
           
       }
        
      public static void Sum()
    {
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number  of elements you want in array: ");
       int n = scanner.nextInt();
       int a[] = new int[n];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<a.length; i++)
      {
    	  a[i] = scanner.nextInt();
      }
      for( int num : a) {
          sum = sum+num;
      }
      System.out.println("Sum of array of elements is: "+sum);
   } 
      
    public static void getMaxValue(){
      
    int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
  

      
public static void getMinValue(){
    
   int n, min;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(min > a[i]) 
            {
                min = a[i];
            }
        }
        System.out.println("Minimum value:"+min);
    }

    public static void Occurrence() {
    int n; 
       Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
    for( int i=0;i<a.length;i++){
        a[i] = s.nextInt();
    }
    int count=1;
    Arrays.sort(a);
    for(int z=0;z<a.length;z++){
        for(int j=0;j<z;j++){
            if(a[z]==a[j] & j!=z){
                count=count+1;
            }
        }
        System.out.print(" The number " + a[z]+" appeared "+count+" times \n ");
        count=1;
        }
    }
    
    public static void sampleSize() {
        
       Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int n = s.nextInt();
        System.out.println("Enter elements of array:");
        int a[] = new int[n];

        
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
        System.out.println("The no. of elements in the array is: "+ n);
     }
    
     public static void Mode(){
        
        

        int maxValue = -1;
        int maxCount = 0;
        int x = 0;
        //count how many times nums[i] appears in array

        int n; 
       Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        
        for (int i = 0; i < a.length; i++) {

            try { //try catch exception to catch decimal inputs as well as more /less than 10 integers
                x = s.nextInt();
                a[i]=x;
            } 
            catch (Exception e) {
                System.out.println("Invalid input! Please reenter 10 integer values.");
                i =i -1;
                s.nextLine();

                continue;
            }
        }
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxValue = a[i];
                maxCount = count;

            }
        }
    System.out.println("The mode of the array is: " + maxValue);
    }  
     
     public static void Range(){
         
         int n, min, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        min = a[0];
        for(int i = 0; i < n; i++)
        {
            if(min > a[i]) 
            {
                min = a[i];
            }
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i]) 
            {
                max = a[i];
            }
        }
        int range = max - min;
        System.out.println("The range is: " + range);
         
     }
     
     public static void standardDeviation()
    {
        
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        double count = 10.0;   // is 10.0 for your problem
        double sum1 = 0.0;    // sum of the numbers
        double sum2 = 0.0;    // sum of the squares
        int counter = 0;
while ( counter < a.length) {
   n = s.nextInt();
  sum1 += n;
  sum2 += n * n;
  counter++;
}
double average = sum1 / count;
double variance = (count * sum2 - sum1 * sum1) / (count * count);
double stdev = Math.sqrt(variance);
System.out.println("The standard deviation is:"+ stdev);
        }
     
     
     public static void Variance() {
         
         int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
       double count = 10.0;   // is 10.0 for your problem
double sum1 = 0.0;    // sum of the numbers
double sum2 = 0.0;    // sum of the squares
int i;
int counter = 0;
while ( counter < a.length) {
   n = s.nextInt();
  sum1 += n;
  sum2 += n * n;
  counter++;
}
double average = sum1 / count;
double variance = (count * sum2 - sum1 * sum1) / (count * count);


System.out.println("The variance is: " + variance);
         
         
     }
     
     public static void zScore(int x) {
         
         int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        double count = 10.0;   // is 10.0 for your problem
        double sum1 = 0.0;    // sum of the numbers
        double sum2 = 0.0;    // sum of the squares
        int counter = 0;
while ( counter < a.length) {
   n = s.nextInt();
  sum1 += n;
  sum2 += n * n;
  counter++;
}
double average = sum1 / count;
double variance = (count * sum2 - sum1 * sum1) / (count * count);
double stdev = Math.sqrt(variance);

double total = 0.0;
        double grade;
        
        while (counter < a.length) {
            grade = s.nextDouble();
            total = total + grade;
            counter++;
            
        }
        average = total / a.length;
        
        double zScore = ((x-average)/stdev);
        System.out.println(zScore);
         
     }
    
    public static void confidenceInterval() {
        int maximumNumber = 10;
        int num = 0;
        double[] data = new double[maximumNumber];

        // first pass: read in data, compute sample mean
        double dataSum = 0.0;
        while (num<maximumNumber) {
            data[num] = num*10;
            dataSum  += data[num];
            num++;
        }
        double ave = dataSum / num;


        double variance1 = 0.0;
        for (int i = 0; i < num; i++) {
            variance1 += (data[i] - ave) * (data[i] - ave);
        }
        double variance = variance1 / (num - 1);
        double standardDaviation= Math.sqrt(variance);
        double lower = ave - 1.96 * standardDaviation;
        double higher = ave + 1.96 * standardDaviation;

        // print results
        System.out.println("average          = " + ave);
        System.out.println("sample variance  = " + variance);
        System.out.println("sample standard daviation    = " + standardDaviation);
        System.out.println("approximate confidence interval");
        System.out.println("[ " + lower + ", " + higher + " ]");
         
     }
    
     
     }
