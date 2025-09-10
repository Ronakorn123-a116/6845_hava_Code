package W13;

import java.util.Random;
import java.util.Scanner;

public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random  Rand = new Random();

        int ans = Rand.nextInt(10) + 1;
       // System.out.println("Randow Number is generated ="+ans);
       int count = 0 ;
       Boolean win = false ;
       //เข้าลูปจนกระทั้งตอบถูก
      while (count <3 ) {
        System.out.println("กรุณากรอกตัวเลขที่จะทาย (1-10)");
        int R = kb.nextInt();
        if (R == ans ) {
          System.out.println("ถูกต้องนะคร้าบบ");
          System.out.println("================");
          win = true;
          break;
        } else {
          System.out.println("ตอบผิด กรุณา ตอบใหม่");
          System.out.println("================");
        }count ++ ;
      }
      if (win == false) 
        System.out.println("ยังไม่ถูกนะครับและคำตอบที่ถูกก็คือ ="+ans);
      
     kb.close();  
    }
}