package W13;

import java.util.Random;
import java.util.Scanner;

public class W13_02_GuessNumber_whiletoforer {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random  Rand = new Random();

        int ans = Rand.nextInt(10) + 1;
       // System.out.println("Randow Number is generated ="+ans);
       
       Boolean win = false ;
       //เข้าลูปจนกระทั้งตอบถูก
      for (int count = 0 ;count <3 ; count ++) {
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
        }
      }
      if (win == false) 
        System.out.println("ยังไม่ถูกนะครับและคำตอบที่ถูกก็คือ ="+ans);
      
     kb.close();  
    }
}