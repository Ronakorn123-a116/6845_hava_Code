package W12;
import java.util.Scanner;
public class W12_01_For_sum_Number_V1 {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Start"+"  ");
        int start = kb.nextInt();
        System.out.println("==========");
        System.out.print("stop"+"  ");
        int stop = kb.nextInt();
        System.out.println("========");
       
      while(start >= stop){
        System.out.println("stop มันน้อยกว่า start ไม่ได้นะพรี่ ");
        System.out.println("ใส่ start ใหม่นะพรี่");
        start = kb.nextInt();
        System.out.println("ใส่ stop ใหม่นะพรี่");
        stop = kb.nextInt();
    }

        int sum = 0;
        int T = 0;
        // if (start < stop) {
            for (int N = start; N <= stop; N++) {
                System.out.println("รอบที่" + " " + (++T) + " :" + "   " + sum + "+" + N + "=" + (sum + N));
                sum = sum + N;

        //     }
        // } else {
        //     System.out.println("ไม่ถูกต้อง   ใส่เลขใหม่");
        //     }
            }

        // // for(int N=n ;N<=stop ;N++){
        // // System.out.println("รอบที่"+" "+(++T)+" :"+" "+sum+"+"+N+"="+ (sum+N) );
        // // sum=sum+N;
            
        }
    }

