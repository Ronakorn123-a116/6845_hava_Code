package Arrays;

import java.util.Scanner;

public class W15_02_sumnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double [5];

        for (int i=0 ; i < a.length ; i++ ){
            
            System.out.print("Enrter number ["+ i +"] ="+ "   ");
            a[i] =kb.nextDouble();
            
        }
        double sum = 0 ;
        double sumodd  =0 ;
        double sumeven =0 ;
        double average = 0;
        double max =a[0];
        double min =a[0];
        System.out.println("Show all number: ");
        for( int i=0;i < a.length  ;i++ ){
            System.out.println("show index [" +i+ "] value = "+    + a[i]);
            sum += a[i];
           if (a[i] % 2 !=0) {
            sumodd += a[i];
           }else {
            sumeven += a[i];
           }
           if (a[i]>max) {
            max = a[i];
           }
           if (a[i]< min) {
            min = a[i];
           }
        }
        
        System.out.println("==============================");
        System.out.println("sum of all number =" + sum);
        System.out.println("==============================");
        System.out.println("sum of odd number="  + sumodd );
        System.out.println("==============================");
        System.out.println("sum of even number=" + sumeven );
        average = sum / a.length ;
        System.out.println("sum of average nuber="+ average);
        System.out.println("==============================");
        System.out.println("show max ="+max);
        System.out.println("show min ="+min);
        kb.close();
    }
}
