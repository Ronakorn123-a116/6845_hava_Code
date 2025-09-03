package W12;

import java.util.Scanner;

public class W12_02_sum_Number_V2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int start ,stop;
        do{
            // System.out.println("stop มันน้อยกว่า start ไม่ได้นะพรี่ ");
            System.out.println("ใส่ start ");
            start = kb.nextInt();
            System.out.println("ใส่ stop ");
            stop = kb.nextInt();
            int sum = 0;
            int T = 0;
             if (start < stop) {
                for (int N = start; N <= stop; N++) {
                    System.out.println("รอบที่" + " " + (++T) + " :" + "   " + sum + "+" + N + "=" + (sum + N));
                    sum = sum + N;
    
                 }
             } else {
                System.out.println("ไม่ถูกต้อง   ใส่เลขใหม่");
                 }
                
    
            //  for(int N=start ;N<=stop ;N++){
            //  System.out.println("รอบที่"+" "+(++T)+" :"+" "+sum+"+"+N+"="+ (sum+N) );
            // sum=sum+N;
            //  }
        } 
        while(start >= stop);
    }
}